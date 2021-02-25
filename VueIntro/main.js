const app = Vue.createApp({
  data() {
    return {
      //Cart Information
      cart: 0,
      //Product name and img with a URL
      product: "Socks",
      img: "./assets/images/socks_blue.jpg",
      url: "http://wp.tysenchristensen.tech/",
      //Product information
      desc: "These are things you put on your feeeeet!",
      inventory: 20,
      onSale: true,
      details: ['50% cotton', '30% wool', '20% polyester'],
      variants:[
        {id: 2234,color: 'green', image: './assets/images/socks_green.jpg'},
        {id: 2235,color: 'blue',image: './assets/images/socks_blue.jpg' },
      ],
      sizes: [
        {id:0 , size:' XS ', inStock: true},
        {id:1, size:' S ', inStock: false},
        {id:2 , size:' M ', inStock: true},
        {id:3 , size:' L ', inStock: false},
        {id:4 , size:' XL ', inStock: true},
      ]
    };
  },
  methods:{
    addToCart(){
      this.cart += 1;
      this.inventory -= 1;
    },
    removeFromCart(){
      this.cart -= 1;
      this.inventory += 1;
    },
    updateImage(vImage){
      this.img = vImage;
    }

  }
});
