package dados;

public class Rede {

    private long quantidade_bytes_recebidos;

    private long quantidade_bytes_enviados;

    private long pacotes_recebidos;
    private long pacotes_enviados;

    public Rede(long quantidade_bytes_recebidos, long quantidade_bytes_enviados, long pacotes_recebidos, long pacotes_enviados) {
        this.quantidade_bytes_recebidos = quantidade_bytes_recebidos;
        this.quantidade_bytes_enviados = quantidade_bytes_enviados;
        this.pacotes_recebidos = pacotes_recebidos;
        this.pacotes_enviados = pacotes_enviados;
    }

    public long getPacotes_recebidos() {
        return pacotes_recebidos;
    }

    public void setPacotes_recebidos(long pacotes_recebidos) {
        this.pacotes_recebidos = pacotes_recebidos;
    }

    public long getPacotes_enviados() {
        return pacotes_enviados;
    }

    public void setPacotes_enviados(long pacotes_enviados) {
        this.pacotes_enviados = pacotes_enviados;
    }

    public long getQuantidade_bytes_recebidos() {
        return quantidade_bytes_recebidos;
    }

    public void setQuantidade_bytes_recebidos(long quantidade_bytes_recebidos) {
        this.quantidade_bytes_recebidos = quantidade_bytes_recebidos;
    }

    public long getQuantidade_bytes_enviados() {
        return quantidade_bytes_enviados;
    }

    public void setQuantidade_bytes_enviados(long quantidade_bytes_enviados) {
        this.quantidade_bytes_enviados = quantidade_bytes_enviados;
    }

    @Override
    public String toString() {
        return String.format("Dados de Rede\n" +
                "Quantidade de bytes recebidos:%d bytes\n" +
                "Quantidade de bytes enviados:%d bytes\n" +
                "Pacotes recebidos:%d bytes\n"+
                "Pacotes enviados:%d bytes\n", quantidade_bytes_recebidos, quantidade_bytes_enviados,pacotes_recebidos,pacotes_enviados);
    }
}
