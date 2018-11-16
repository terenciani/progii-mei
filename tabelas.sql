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

CREATE SEQUENCE public.tb_clientes_codigo_seq
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 100000
  START 1
  CACHE 1;
ALTER TABLE public.tb_clientes_codigo_seq
  OWNER TO postgres;

-- Table: public.tb_clientes

-- DROP TABLE public.tb_clientes;

CREATE TABLE public.tb_clientes
(
  codigo integer NOT NULL DEFAULT nextval('tb_clientes_codigo_seq'::regclass),
  "cpfCnpj" character varying(14),
  nome character varying(50),
  "nomeFantasia" character varying(50),
  "inscrEstadual" character varying(20),
  telefone character varying(20),
  email character varying(30)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.tb_clientes
  OWNER TO postgres;
