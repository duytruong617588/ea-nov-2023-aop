INSERT INTO lab_aop.product (id, name) VALUES ('2e754b46-1572-47fc-a443-0c68d763fdbb', 'name');
INSERT INTO lab_aop.product (id, name) VALUES ('7247a8b2-76ab-4a1e-a657-1710b928b72e', 'name');
INSERT INTO lab_aop.product (id, name) VALUES ('9d5f320c-456a-46f4-a55b-993c176f4f1c', 'name');
INSERT INTO lab_aop.product (id, name) VALUES ('df994b03-0e74-4b40-97f5-864e01fa2d78', 'name');
INSERT INTO lab_aop.product (id, name) VALUES ('f1236c75-debe-474d-b21b-126595337102', '');

INSERT INTO lab_aop.review (id, comment, product_id) VALUES ('77f65196-e6e8-4d33-a427-65c646f37970', 'updated_comment', '2e754b46-1572-47fc-a443-0c68d763fdbb');
INSERT INTO lab_aop.review (id, comment, product_id) VALUES ('fa8ab0de-b050-4537-b1c0-a0d838495f95', 'comment', '2e754b46-1572-47fc-a443-0c68d763fdbb');

INSERT INTO lab_aop.activity_log (id, date, duration, operation) VALUES (1, '2024-04-06', 103, 'getAll');
INSERT INTO lab_aop.activity_log (id, date, duration, operation) VALUES (2, '2024-04-06', 142, 'getAll');
INSERT INTO lab_aop.activity_log (id, date, duration, operation) VALUES (3, '2024-04-06', 0, 'getAll');
INSERT INTO lab_aop.activity_log (id, date, duration, operation) VALUES (4, '2024-04-06', 0, 'getAll');
INSERT INTO lab_aop.activity_log (id, date, duration, operation) VALUES (5, '2024-04-06', 146, 'getAll');
INSERT INTO lab_aop.activity_log (id, date, duration, operation) VALUES (6, '2024-04-06', 120, 'getAll');
INSERT INTO lab_aop.activity_log (id, date, duration, operation) VALUES (7, '2024-04-06', 116, 'getAll');
INSERT INTO lab_aop.activity_log (id, date, duration, operation) VALUES (8, '2024-04-06', 127, 'getAll');
INSERT INTO lab_aop.activity_log (id, date, duration, operation) VALUES (9, '2024-04-06', 114, 'getAll');
INSERT INTO lab_aop.activity_log (id, date, duration, operation) VALUES (10, '2024-04-06', 135, 'getAll');
INSERT INTO lab_aop.activity_log (id, date, duration, operation) VALUES (11, '2024-04-06', 179, 'getAll');
INSERT INTO lab_aop.activity_log (id, date, duration, operation) VALUES (12, '2024-04-06', 0, 'getAll');
INSERT INTO lab_aop.activity_log (id, date, duration, operation) VALUES (13, '2024-04-06', 0, 'ResponseEntity.ok(reviewService.getAll())');
