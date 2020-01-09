describe('Listar Clientes', function() {
    it('debe listar clientes', function() {
        browser.get('http://localhost:3002/cliente');

        let listaClientes = element.all(by.css('.item-lista'));
        expect(listaClientes.count()).toBeGreaterThanOrEqual(0);
    });

});