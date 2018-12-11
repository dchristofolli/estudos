class Pessoa:
    # atributos
    nome = None 
    ano_nascimento = None
    telefone = None

    # construtor
    def __init__(self, nome, ano_nascimento, telefone):
        self.nome = nome
        self.ano_nascimento = ano_nascimento
        self.telefone = telefone
    
    def calcular_idade(self):
        return 2018 - self.ano_nascimento
    
    def calcular_fase_da_vida(self):
        idade = self.calcular_idade()
        if idade < 16:
            return 'adolescente'
        elif idade >= 16 and idade <= 24:
            return 'jovem'
        else:
            return 'idoso'



kari = Pessoa('Kari', 1990, 51991126921)
print(kari)
print(kari.calcular_idade())

print(kari.calcular_fase_da_vida())