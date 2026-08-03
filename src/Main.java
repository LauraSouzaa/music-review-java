import java.util.Scanner;
void main() {
  String cadastrarArtista = "";
  String cadastrarAlbum = "";
  String cadastrarMusica = "";
  int avaliacaoArtista = 0;
  int avaliacaoAlbum = 0;
  int avaliacaoMusica = 0;
  String menu = """
          Bem vindo (a) ao MUSIC REVIEW!
          1. Cadastrar artista
          2. Cadastrar álbum
          3. Cadastrar música
          4. Avaliar
          0. Sair
          """;
  String avaliacao = """
          === AVALIAR ===
          O que voce deseja avaliar?
          1. Artista
          2. Álbum
          3. Música
          """;
  int opcaoUsuario = -1;
  Scanner scanner = new Scanner(System.in);
  while (opcaoUsuario != 0) {
    System.out.println(menu);
    System.out.println("Escolha uma opção: ");
    opcaoUsuario = scanner.nextInt();

    switch (opcaoUsuario) {
      case 1:
        scanner.nextLine();
        System.out.println("Digite o nome do artista que deseja cadastrar: ");
        cadastrarArtista = scanner.nextLine();
        System.out.println("Artista " + cadastrarArtista + " cadastrado (a)!");
        break;
      case 2:
        scanner.nextLine();
        System.out.println("Digite o nome do álbum que deseja cadastrar: ");
        cadastrarAlbum = scanner.nextLine();
        System.out.println("Álbum cadastrado: " + cadastrarAlbum);
        break;
      case 3:
        scanner.nextLine();
        System.out.println("Digite o nome da música que deseja cadastrar: ");
        cadastrarMusica = scanner.nextLine();
        System.out.println("Música " + cadastrarMusica + " cadastrada!");
        break;
      case 4:
        scanner.nextLine();
        System.out.println(avaliacao);
        int tipoAvaliacao = scanner.nextInt();
        switch (tipoAvaliacao) {
          case 1:
            scanner.nextLine();
            System.out.println("Digite o nome do artista que deseja avaliar: ");
            String artistaEscolhido = scanner.nextLine();
            if (artistaEscolhido.equals(cadastrarArtista)) {
              System.out.println("Digite a nota de 0 a 10: ");
              avaliacaoArtista = scanner.nextInt();
              if (avaliacaoArtista >= 0 && avaliacaoArtista <= 10) {
                System.out.println("Avaliação registrada!");
              } else {
                System.out.println("Nota inválida.");
              }
            } else {
              System.out.println("Artista não encontrado.");
            }
            break;
          case 2:
            scanner.nextLine();
            System.out.println("Digite o nome do álbum que deseja avaliar: ");
            String albumEscolhido = scanner.nextLine();
            if (albumEscolhido.equals(cadastrarAlbum)) {
              System.out.println("Digite a nota de 0 a 10: ");
              avaliacaoAlbum = scanner.nextInt();
              if (avaliacaoAlbum >= 0 && avaliacaoAlbum <= 10) {
                System.out.println("Avaliação registrada!");
              } else {
                System.out.println("Nota inválida.");
              }
            } else {
              System.out.println("Álbum não encontrado.");
            }
            break;
          case 3:
            scanner.nextLine();
            System.out.println("Digite o nome da música que deseja avaliar: ");
            String musicaEscolhida = scanner.nextLine();
            if (musicaEscolhida.equals(cadastrarMusica)) {
              System.out.println("Digite a nota de 0 a 10: ");
              avaliacaoMusica = scanner.nextInt();
              if (avaliacaoMusica >= 0 && avaliacaoMusica <= 10) {
                System.out.println("Avaliação registrada!");
              } else {
                System.out.println("Nota inválida.");
              }
            } else {
              System.out.println("Música não encontrada.");
            }
            break;
        }
        break;
      case 0:
        System.out.println("Obrigada por usar o Music Review!");
        break;
      default:
        System.out.println("Opção inválida!");
        break;
    }
  }
}
