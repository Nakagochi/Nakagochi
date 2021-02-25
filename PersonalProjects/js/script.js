var app = new Vue({
    el: '#app',
    data: {
      message: 'Hello Vue!'
    }
  });
  

var app2 = new Vue({
    el:'#app-2',
    data:{
        message: 'You loaded this page on ' +  new Date().toLocaleDateString()
    }
});

var app3 = new Vue({
    el:'#app-3',
    data:{
        seen: true
    }
});

var app4 = new Vue({
    el:'#app-4',
    data:{
        todos:[
            {text: 'Learn JavaScript'},
            {text: 'Learn Vue'},
            {text: 'Wish I could focus on this stuffffff'}
        ]
    }
});

var app5 = new Vue({
    el: '#app-5',
    data:{
        message:'Hello from the other side'
    },
    methods:{
        reverseMessage: function() {
            this.message = this.message.split('').reverse().join('')

        }
    }
});

var app6 = new Vue({
    el: '#app-6',
    data:{
        message: ""
    }
});