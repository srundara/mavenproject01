-- SQLBook: Code
create table branches(
    id int4 generated by
    default as identity,
    address varchar(255),
    branch_name varchar(255),
    description varchar(255),
    primary key(id)
)
create table classes(
    id int4 generated by
    default as identity,
    branch_id int4,
    class_name varchar(255),
    description varchar(255),
    primary key(id)
)
create table students(
    id int4 generated by
    default as identity,
    dob date,
    class_id int4,
    first_name varchar(255),
    gender varchar(255),
    last_name varchar(255),
    parent_id int4,
    phone varchar(255),
    place_of_birth varchar(255),
    primary key(id)
)

create table families(
    id int4 generated by
    default as identity,
    address varchar(255),
    father_nme varchar(255),
    mother_name varchar(255),
    phone varchar(255),
    student_id int4,
    primary key(id)
)

create table cars(
    id int4 generated by
    default as identity,
    car varchar(255),
    color_id int4,
    primary key(id)
)
create table colors(
    id int4 generated by
    default as identity,
    color varchar(255),
    primary key(id)
)

create table semesters(
    id int4 generated by default as identity, 
    semester varchar(255) null,
    primary key(id)
)
create table subjects(
    id int4 generated by default as identity, 
    subject varchar(255),
    primary key(id)
)

create table classsubjects(
    id int4 generated by default as identity, 
    classId int4,
    subjectId int4,
    primary key(id)
)




 
 INSERT INTO public.branches (address,branch_name,description,class_name,class_address) VALUES
	 ('asdhasdhadhag','ABC','adjasdadjashdjhda',NULL,NULL),
	 ('ahdjasda','AEU','adhajdjadyyasdasdada',NULL,NULL),
	 ('Phnom Penh','ACE','aaa',NULL,NULL),
	 ('Phnom Penh','CUF','aaa',NULL,NULL);

INSERT INTO public.cars (car,color_id,colorss,colors) VALUES
	 ('BMW',1,NULL,NULL),
	 ('Prius',1,NULL,NULL),
	 ('Prius',2,NULL,NULL),
	 ('Prius',3,NULL,NULL),
	 ('BMW',3,NULL,NULL),
	 ('CRV',3,NULL,NULL),
	 ('CRV',1,NULL,NULL),
	 ('CRV',5,NULL,NULL),
	 ('Camery',5,NULL,NULL),
	 ('Camery',2,NULL,NULL);

INSERT INTO public.classes (branch_id,class_name,description,branch_name) VALUES
	 (1,'10','123',NULL),
	 (1,'11','123',NULL),
	 (1,'12','123',NULL),
	 (2,'12','123',NULL),
	 (3,'12','123',NULL),
	 (3,'11','123',NULL);

INSERT INTO public.classsubjects (classid,subjectid) VALUES
	 (1,1),
	 (1,8),
	 (9,8),
	 (9,11);

INSERT INTO public.colors (color) VALUES
	 ('Red'),
	 ('Blue'),
	 ('Black'),
	 ('Green'),
	 ('White');

INSERT INTO public.semesters (semester) VALUES
	 ('jakdjka'),
	 ('hi'),
	 ('Semester1'),
	 ('Semester2'),
	 ('Semester3');

INSERT INTO public.subjects (subject) VALUES
	 ('Khmer'),
	 ('English'),
	 ('Phicial'),
	 ('Math');


