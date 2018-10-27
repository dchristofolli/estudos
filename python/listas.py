cidades = ['Porto Alegre', 'Canoas', 'Novo Hamburgo', 'Esteio', 'Portao']

# ###### FILTRAR
# maneira 1 (mais simples de entender)
def filtrar_cidades_com_a_letra(cidades, letra):
    cidades_com_a_letra = []
    for cidade in cidades:
        if cidade.startswith(letra):
            cidades_com_a_letra.append(cidade)
    return cidades_com_a_letra

print(filtrar_cidades_com_a_letra(cidades, 'P'))

# maneira 2
# print(filter(lambda cidade: cidade.startswith('P'), cidades))

# maneira 3
# def filtrar_por_letra(cidade):
#     return cidade.startswith('P')

# print(filter(filtrar_por_letra, cidades))

 
# ###### TRANSFORMAR
# maneira 1
def concatenar_coisas(cidades):
    cidades_com_coisas = []
    for cidade in cidades:
        cidades_com_coisas.append(cidade+'#$$#$$')
    return cidades_com_coisas

print(concatenar_coisas(cidades))

# maneira 2
# def concatenar_coisas(cidade):
#     return cidade+'#$$#$$'

# print(map(concatenar_coisas , cidades))

# maneira 3
# print(map(lambda cidade: cidade+'#$$#$$', cidades))
