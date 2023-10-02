-- Inserir uma Lista
INSERT INTO Lista (id) VALUES (1);

-- Inserir itens na tabela Item e associá-los à Lista
INSERT INTO Item (title, qtde, lista_id) VALUES ('banana', 12, 1); -- Onde "1" é o ID da Lista
INSERT INTO Item (title, qtde, lista_id) VALUES ('maçã', 5, 1);   -- Onde "1" é o ID da Lista
