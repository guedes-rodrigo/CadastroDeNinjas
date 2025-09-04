-- Criar tabela de missões
CREATE TABLE tb_missoes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    dificuldade VARCHAR(100) NOT NULL
);

-- Criar tabela de ninjas
CREATE TABLE tb_cadastro (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    img_url INT,
    idade INT NOT NULL,
    missoes_id BIGINT,
    CONSTRAINT fk_ninja_missao FOREIGN KEY (missoes_id) REFERENCES tb_missoes(id)
);
