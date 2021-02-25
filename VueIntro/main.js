const app = Vue.createApp({
  data() {
    return {
      //Cart Information
      cart: 0,
      //Product name and img with a URL
      product: "Socks",
      selectedVariant: 0,
      url: "http://wp.tysenchristensen.tech/",
      //Product information
      brand:'Vue Mastery',
      desc: "These are things you put on your feeeeet!",
      onSale: false,
      details: ["50% cotton", "30% wool", "20% polyester"],
      variants: [
        { id: 2234, color: "green", image: "./assets/images/socks_green.jpg", quantity: 50 },
        { id: 2235, color: "blue", image: "./assets/images/socks_blue.jpg", quantity: 0 },
      ],
      sizes: [
        { id: 0, size: " XS ", inStock: true },
        { id: 1, size: " S ", inStock: false },
        { id: 2, size: " M ", inStock: true },
        { id: 3, size: " L ", inStock: false },
        { id: 4, size: " XL ", inStock: true },
      ],
    };
  },
  methods: {
    addToCart() {
  
        this.cart += 1;
        this.inventory -= 1;
    },
    removeFromCart() {
      if (this.cart > 0 ) {
        this.cart -= 1;
        this.inventory += 1;
      }
    },
    updateVariant(index) {
      this.selectedVariant = index;
    },
  },
  computed: {
    title() {
      return this.brand + " " +this.product 
    },
    image(){
      return this.variants[this.selectedVariant].image;
    },
    inStock(){
      return this.variants[this.selectedVariant].quantity;
    },
    sale(){
      return(this.onSale ? this.brand+" "+this.product + "is on sale" : ''); 
    }
  }
});
