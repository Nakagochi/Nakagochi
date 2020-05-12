document.addEventListener("DOMContentLoaded", () => {
    /*DOC ELEMENTS*/
    const button = document.querySelector("div footer button");
    const quote = document.querySelector("blockquote p");
    const citation = document.querySelector("blockquote footer");


    async function quoteUpdate() {
        /*Gets random quote from the Quotable API*/
        const connection = await fetch('https://api.quotable.io/random');
        const data = await connection.json();
        if (connection.ok) {
            /*Puts quote into DOM elemnts*/
            quote.textContent = data.content;
            citation.textContent = data.author;
        } else {
            quote.textContent = "An error occured connecting to the Database"
            console.log(data);
        }
    }
    button.addEventListener("click", quoteUpdate);

    quoteUpdate();

});