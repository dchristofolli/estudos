class ListaEncadeada():
    proximo = None
    valor = None
    
    def append(self, valor):
        temporario = ListaEncadeada()
        temporario.proximo = self.proximo
        temporario.valor = valor
        self.proximo = temporario
    
    def listar(self):
        aux = self
        while aux is not None:
            print(aux.valor)
            print(aux.proximo)
            aux = aux.proximo

dados = [9,8,7,6,5,4,3,2,1]
head = ListaEncadeada()
for dado in dados:
    head.append(dado)

head.listar()
