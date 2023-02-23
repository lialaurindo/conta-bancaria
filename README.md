# Conta Bancária

📏PROJETO GUIADO | 📕 BLOCO I | Projeto para aplicação de Orientação a Objetos em Java.
- Trata-se de um sistema gerenciador de Contas Bancárias.

## 📐 Padrão de Projeto ##
  Arquitetura em camadas:
- Interface Usuario (GUI) > Menu
- Comunicação: Repository > Interface ContaRepository
- Regras de Negocio: Controller > ContaController (implementar os metodos da Interface e manipular o Banco de Dados)
- Dados: Pacote Model > classes modeladoras > Conta, ContaCorrente e ContaPoupança 


