/* To stores UUID values in the PostgreSQL database, you use the UUID data type.   */
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

INSERT INTO "public".role (reference_id, version, name)
VALUES
      (uuid_generate_v4()::varchar, 0, 'PROJECT_ADMIN'),
      (uuid_generate_v4()::varchar, 0, 'PROGRAM_MANAGER'),
      (uuid_generate_v4()::varchar, 0, 'SYSTEM_ADMIN'),
      (uuid_generate_v4()::varchar, 0, 'MENTOR');

INSERT INTO "public".user (reference_id, version, created_by, created_date, last_modified_by, last_modified_date, email, name, password)
VALUES
(uuid_generate_v4()::varchar, 0, 'ole', CURRENT_TIMESTAMP, 'ole', CURRENT_TIMESTAMP, 'mentor@secure.app','Mentor', 'dbf02f0b755c5d7f5e2df3d12470078648cbc73df1f9a3c6306a2fb0f95057531ca943735d69203e'),
(uuid_generate_v4()::varchar, 0, 'ole', CURRENT_TIMESTAMP, 'ole', CURRENT_TIMESTAMP, 'system_admin@secure.app','System Admin', '1ac79fed9434f9f9cfe27920a19997ce997d1186fdaa157e63ea3831a4b11920676f601867c1525e'),
(uuid_generate_v4()::varchar, 0, 'ole', CURRENT_TIMESTAMP, 'ole', CURRENT_TIMESTAMP, 'project_admin@secure.app','Project Admin', '87782c28f484dc459ae527a8fb72fcfaa9e812ee0a3ad38d2bcdc6d0d7d709b6bdd2d75b03e3c753'),
(uuid_generate_v4()::varchar, 0, 'ole', CURRENT_TIMESTAMP, 'ole', CURRENT_TIMESTAMP, 'program_manager@secure.app','Program Manager', '96fb71094cae2eb3b3f71fefe312f29f98a55a29a8ed7e240071fc7141f527de27d416bc03f2903a');

INSERT INTO user_role(user_id, role_id) SELECT "user".id, role.id FROM "user" CROSS JOIN role WHERE "user".email = 'mentor@secure.app' AND role.name='MENTOR';
INSERT INTO user_role(user_id, role_id) SELECT "user".id, role.id FROM "user" CROSS JOIN role WHERE "user".email = 'system_admin@secure.app' AND role.name='SYSTEM_ADMIN';
INSERT INTO user_role(user_id, role_id) SELECT "user".id, role.id FROM "user" CROSS JOIN role WHERE "user".email = 'project_admin@secure.app' AND role.name='PROJECT_ADMIN';
INSERT INTO user_role(user_id, role_id) SELECT "user".id, role.id FROM "user" CROSS JOIN role WHERE "user".email = 'program_manager@secure.app' AND role.name='PROGRAM_MANAGER';
