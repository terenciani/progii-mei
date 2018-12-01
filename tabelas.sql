-- Sequence: public.tb_endereco_id_seq

-- DROP SEQUENCE public.tb_endereco_id_seq;

CREATE SEQUENCE public.tb_endereco_codigo_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 100000
  START 1
  CACHE 1;
ALTER TABLE public.tb_endereco_codigo_seq
  OWNER TO postgres;

-- Table: public.tb_endereco

-- DROP TABLE public.tb_endereco;

CREATE TABLE public.tb_endereco
(
    codigo integer NOT NULL DEFAULT nextval('tb_endereco_codigo_seq1'::regclass),
    rua character varying COLLATE pg_catalog."default",
    numero integer,
    bairro character varying COLLATE pg_catalog."default",
    cidade character varying COLLATE pg_catalog."default",
    estado character varying COLLATE pg_catalog."default",
    cep character varying COLLATE pg_catalog."default",
    complemento character varying COLLATE pg_catalog."default",
    CONSTRAINT tb_endereco_pkey PRIMARY KEY (codigo)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.tb_endereco
    OWNER to postgres;
    
-- Table: public.tb_aluno

-- DROP TABLE public.tb_aluno;
CREATE SEQUENCE public.tb_aluno_id_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 100000
  START 1
  CACHE 1;
ALTER TABLE public.tb_aluno_id_seq
  OWNER TO postgres;
  
CREATE TABLE public.tb_aluno
(
  id integer NOT NULL DEFAULT nextval('tb_aluno_id_seq'::regclass),
  ra integer,
  nome character varying(255),
  senha character varying(255),
  CONSTRAINT pk_id PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.tb_aluno
  OWNER TO postgres;


-- Sequence: public.tb_aluno_id_seq

-- DROP SEQUENCE public.tb_aluno_id_seq;

CREATE SEQUENCE public.tb_cliente_codigo_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 100000
  START 1
  CACHE 1;
ALTER TABLE public.tb_cliente_codigo_seq
  OWNER TO postgres;

-- Table: public.tb_cliente

-- DROP TABLE public.tb_cliente;

CREATE TABLE public.tb_cliente
(
    codigo integer NOT NULL DEFAULT nextval('tb_cliente_codigo_seq1'::regclass),
    cpfcnpj character varying COLLATE pg_catalog."default",
    nome character varying COLLATE pg_catalog."default",
    nomefantasia character varying COLLATE pg_catalog."default",
    inscrestadual character varying COLLATE pg_catalog."default",
    telefone character varying COLLATE pg_catalog."default",
    email character varying COLLATE pg_catalog."default",
    codendereco integer,
    CONSTRAINT tb_cliente_pkey PRIMARY KEY (codigo),
    CONSTRAINT fk_endereco FOREIGN KEY (codendereco)
        REFERENCES public.tb_endereco (codigo) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.tb_cliente
    OWNER to postgres;
 
 CREATE SEQUENCE public.tb_contas_a_pagar_codigo_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

ALTER SEQUENCE public.tb_contas_a_pagar_codigo_seq
    OWNER TO postgres;
 
  -- Table: public.tb_contas_a_pagar

-- DROP TABLE public.tb_contas_a_pagar;

CREATE TABLE public.tb_contas_a_pagar
(
    codigo integer NOT NULL DEFAULT nextval('tb_contas_a_pagar_codigo_seq'::regclass),
    data_vencimento date,
    descricao character varying(255) COLLATE pg_catalog."default",
    valor numeric,
    data_pagamento date,
    status boolean,
    CONSTRAINT tb_contas_a_pagar_pkey PRIMARY KEY (codigo)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.tb_contas_a_pagar
    OWNER to postgres;
	
CREATE SEQUENCE public.tb_usuario_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

ALTER SEQUENCE public.tb_usuario_id_seq
    OWNER TO postgres;
	
	-- Table: public.tb_usuario

-- DROP TABLE public.tb_usuario;

CREATE TABLE public.tb_usuario
(
    id integer NOT NULL DEFAULT nextval('tb_usuario_id_seq'::regclass),
    nome character varying(255) COLLATE pg_catalog."default",
    usuario character varying(255) COLLATE pg_catalog."default",
    senha character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT tb_usuario_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.tb_usuario
    OWNER to postgres;
	
	CREATE SEQUENCE public.tb_categoria_codigo_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

ALTER SEQUENCE public.tb_categoria_codigo_seq
    OWNER TO postgres;

	-- Table: public.tb_categoria

-- DROP TABLE public.tb_categoria;

CREATE TABLE public.tb_categoria
(
    codigo integer NOT NULL DEFAULT nextval('tb_categoria_codigo_seq'::regclass),
    descricao character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT tb_categoria_pkey PRIMARY KEY (codigo)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.tb_categoria
    OWNER to postgres;
	
	CREATE SEQUENCE public.tb_produto_id_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

ALTER SEQUENCE public.tb_produto_id_seq
    OWNER TO postgres;
	
	-- Table: public.tb_produto

-- DROP TABLE public.tb_produto;

CREATE TABLE public.tb_produto
(
    id integer NOT NULL DEFAULT nextval('tb_produto_id_seq'::regclass),
    nome character varying(255) COLLATE pg_catalog."default",
    valor numeric,
    quantidade_estoque integer,
    lucro numeric,
    fk_categoria integer,
    CONSTRAINT tb_produto_pkey PRIMARY KEY (id),
    CONSTRAINT fk_categoria FOREIGN KEY (fk_categoria)
        REFERENCES public.tb_categoria (codigo) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.tb_produto
    OWNER to postgres;
	

	CREATE SEQUENCE public.tb_sac_codigo_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1;

ALTER SEQUENCE public.tb_sac_codigo_seq
    OWNER TO postgres;
	-- Table: public.tb_sac

-- DROP TABLE public.tb_sac;

CREATE TABLE public.tb_sac
(
    codigo integer NOT NULL DEFAULT nextval('tb_sac_codigo_seq'::regclass),
    "palavra-chave" character varying(255) COLLATE pg_catalog."default",
    pergunta character varying(255) COLLATE pg_catalog."default",
    resposta text COLLATE pg_catalog."default",
    CONSTRAINT tb_sac_pkey PRIMARY KEY (codigo)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.tb_sac
    OWNER to postgres;
