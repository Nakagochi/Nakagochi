Vue.component('todo-item', {
    props: ['todo'],
    template: '<li>{{todo.text}}</li>'
});

var app = new Vue({
    el: '#todo',
    data: {
        groceryList: [
          { id: 0, text: 'Vegetables' },
          { id: 1, text: 'Cheese' },
          { id: 2, text: 'Whatever else humans are supposed to eat' },
          { id: 3, text: 'Vegetables' },
          { id: 4, text: 'Cheese' },
          { id: 5, text: 'Whatever else humans are supposed to eat' }
        ]
      }
});