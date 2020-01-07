exports.config = {
    allScriptsTimeout: 11000,
    framework: 'jasmine',
    capabilities: {
        browserName: 'chrome'
    },
    seleniumAddress: 'http://localhost:4444/wd/hub',
    specs: ['listarClientes.e2e.js','crearCarrera.e2e.js'],
    directConnect: true,
    baseUrl: 'http://localhost:3002/',

};