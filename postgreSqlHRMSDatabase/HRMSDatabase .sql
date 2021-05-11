-- Table: public.confirmation_history

-- DROP TABLE public.confirmation_history;

CREATE TABLE public.confirmation_history
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( CYCLE INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    is_confirmed_company character varying(50) COLLATE pg_catalog."default" NOT NULL,
    confirming_staff_code character varying(5) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT "confirmationHistory_pkey" PRIMARY KEY (id),
    CONSTRAINT "confirmationHistoryCompanyForeign" FOREIGN KEY (is_confirmed_company)
        REFERENCES public.employers (company_name) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT "confirmationHistoryStaffCodeForeign" FOREIGN KEY (confirming_staff_code)
        REFERENCES public.system_workers (staff_code) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public.confirmation_history
    OWNER to postgres;
-- Index: fki_confirmationHistoryCompanyForeign

-- DROP INDEX public."fki_confirmationHistoryCompanyForeign";

CREATE INDEX "fki_confirmationHistoryCompanyForeign"
    ON public.confirmation_history USING btree
    (is_confirmed_company COLLATE pg_catalog."default" ASC NULLS LAST)
    TABLESPACE pg_default;
-- Index: fki_confirmationHistoryStaffCodeForeign

-- DROP INDEX public."fki_confirmationHistoryStaffCodeForeign";

CREATE INDEX "fki_confirmationHistoryStaffCodeForeign"
    ON public.confirmation_history USING btree
    (confirming_staff_code COLLATE pg_catalog."default" ASC NULLS LAST)
    TABLESPACE pg_default;
	
	
	-- Table: public.employers

-- DROP TABLE public.employers;

CREATE TABLE public.employers
(
    user_id integer NOT NULL,
    company_name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    web_address character varying(250) COLLATE pg_catalog."default" NOT NULL,
    phone_number character varying(10) COLLATE pg_catalog."default" NOT NULL,
    is_confirmed boolean NOT NULL DEFAULT false,
    is_verified boolean NOT NULL DEFAULT false,
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( CYCLE INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    CONSTRAINT employers_pkey PRIMARY KEY (id),
    CONSTRAINT "companyNameUnique" UNIQUE (company_name),
    CONSTRAINT employers_foreign FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public.employers
    OWNER to postgres;
	
	
	-- Table: public.job_seekers

-- DROP TABLE public.job_seekers;

CREATE TABLE public.job_seekers
(
    user_id integer NOT NULL,
    first_name character varying(25) COLLATE pg_catalog."default" NOT NULL,
    last_name character varying(25) COLLATE pg_catalog."default" NOT NULL,
    national_identity character varying(11) COLLATE pg_catalog."default" NOT NULL,
    birth_date integer NOT NULL,
    is_verified boolean NOT NULL DEFAULT false,
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( CYCLE INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    CONSTRAINT "jobSeekers_pkey" PRIMARY KEY (id),
    CONSTRAINT "jobSeekers_foreign" FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public.job_seekers
    OWNER to postgres;
	
	
	-- Table: public.positions

-- DROP TABLE public.positions;

CREATE TABLE public.positions
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( CYCLE INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    position_name character varying(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT positions_pkey PRIMARY KEY (id),
    CONSTRAINT position_name_unique UNIQUE (position_name)
)

TABLESPACE pg_default;

ALTER TABLE public.positions
    OWNER to postgres;
	
	
	
	-- Table: public.system_workers

-- DROP TABLE public.system_workers;

CREATE TABLE public.system_workers
(
    user_id integer NOT NULL,
    staff_code character varying(20) COLLATE pg_catalog."default" NOT NULL,
    first_name character varying(25) COLLATE pg_catalog."default" NOT NULL,
    last_name character varying(25) COLLATE pg_catalog."default" NOT NULL,
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( CYCLE INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    CONSTRAINT "systemWorkers_pkey" PRIMARY KEY (id),
    CONSTRAINT "staffCodeUnique" UNIQUE (staff_code),
    CONSTRAINT "systemWorkersForeign" FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public.system_workers
    OWNER to postgres;
	
	
	
	-- Table: public.users

-- DROP TABLE public.users;

CREATE TABLE public.users
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( CYCLE INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    email character varying(250) COLLATE pg_catalog."default" NOT NULL,
    password character varying(250) COLLATE pg_catalog."default" NOT NULL,
    password_confirm boolean NOT NULL DEFAULT false,
    CONSTRAINT users_pkey PRIMARY KEY (id),
    CONSTRAINT email_unique UNIQUE (email)
)

TABLESPACE pg_default;

ALTER TABLE public.users
    OWNER to postgres;
	
	
	
	
	-- Table: public.verification_codes

-- DROP TABLE public.verification_codes;

CREATE TABLE public.verification_codes
(
    user_id integer NOT NULL,
    code character varying(5) COLLATE pg_catalog."default" NOT NULL,
    creation_date date NOT NULL,
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( CYCLE INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    CONSTRAINT "verificationCodes_pkey" PRIMARY KEY (id),
    CONSTRAINT "verificationCodesForeign" FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE public.verification_codes
    OWNER to postgres;