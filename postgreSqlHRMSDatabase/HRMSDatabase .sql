PGDMP     /                    y            Hrms    13.2    13.2 &    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16563    Hrms    DATABASE     c   CREATE DATABASE "Hrms" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE "Hrms";
                postgres    false            �            1259    24681    confirmation_history    TABLE     �   CREATE TABLE public.confirmation_history (
    id integer NOT NULL,
    is_confirmed_company character varying(50) NOT NULL,
    confirming_staff_code character varying(5) NOT NULL
);
 (   DROP TABLE public.confirmation_history;
       public         heap    postgres    false            �            1259    24679    confirmationHistory_id_seq    SEQUENCE     �   ALTER TABLE public.confirmation_history ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."confirmationHistory_id_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
    CYCLE
);
            public          postgres    false    209            �            1259    24642 	   employers    TABLE     M  CREATE TABLE public.employers (
    user_id integer NOT NULL,
    company_name character varying(50) NOT NULL,
    web_address character varying(250) NOT NULL,
    phone_number character varying(10) NOT NULL,
    is_confirmed boolean DEFAULT false NOT NULL,
    is_verified boolean DEFAULT false NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.employers;
       public         heap    postgres    false            �            1259    24718    employers_id_seq    SEQUENCE     �   ALTER TABLE public.employers ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.employers_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
    CYCLE
);
            public          postgres    false    205            �            1259    24716    hibernate_sequence    SEQUENCE     {   CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE public.hibernate_sequence;
       public          postgres    false            �            1259    24631    job_seekers    TABLE     ?  CREATE TABLE public.job_seekers (
    user_id integer NOT NULL,
    first_name character varying(25) NOT NULL,
    last_name character varying(25) NOT NULL,
    national_identity character varying(11) NOT NULL,
    birth_date integer NOT NULL,
    is_verified boolean DEFAULT false NOT NULL,
    id integer NOT NULL
);
    DROP TABLE public.job_seekers;
       public         heap    postgres    false            �            1259    24727    jobSeekers_id_seq    SEQUENCE     �   ALTER TABLE public.job_seekers ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."jobSeekers_id_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
    CYCLE
);
            public          postgres    false    204            �            1259    24626 	   positions    TABLE     m   CREATE TABLE public.positions (
    id integer NOT NULL,
    position_name character varying(20) NOT NULL
);
    DROP TABLE public.positions;
       public         heap    postgres    false            �            1259    24624    positions_id_seq    SEQUENCE     �   ALTER TABLE public.positions ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.positions_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
    CYCLE
);
            public          postgres    false    203            �            1259    24654    system_workers    TABLE     �   CREATE TABLE public.system_workers (
    user_id integer NOT NULL,
    staff_code character varying(20) NOT NULL,
    first_name character varying(25) NOT NULL,
    last_name character varying(25) NOT NULL,
    id integer NOT NULL
);
 "   DROP TABLE public.system_workers;
       public         heap    postgres    false            �            1259    24734    systemWorkers_id_seq    SEQUENCE     �   ALTER TABLE public.system_workers ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."systemWorkers_id_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
    CYCLE
);
            public          postgres    false    206            �            1259    24592    users    TABLE     �   CREATE TABLE public.users (
    id integer NOT NULL,
    email character varying(250) NOT NULL,
    password character varying(250) NOT NULL,
    password_confirm boolean DEFAULT false NOT NULL
);
    DROP TABLE public.users;
       public         heap    postgres    false            �            1259    24590    users_id_seq    SEQUENCE     �   ALTER TABLE public.users ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
    CYCLE
);
            public          postgres    false    201            �            1259    24664    verification_codes    TABLE     �   CREATE TABLE public.verification_codes (
    user_id integer NOT NULL,
    code character varying(5) NOT NULL,
    creation_date date NOT NULL,
    id integer NOT NULL
);
 &   DROP TABLE public.verification_codes;
       public         heap    postgres    false            �            1259    24742    verificationCodes_id_seq    SEQUENCE     �   ALTER TABLE public.verification_codes ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."verificationCodes_id_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
    CYCLE
);
            public          postgres    false    207            Z           2606    24688    employers companyNameUnique 
   CONSTRAINT     `   ALTER TABLE ONLY public.employers
    ADD CONSTRAINT "companyNameUnique" UNIQUE (company_name);
 G   ALTER TABLE ONLY public.employers DROP CONSTRAINT "companyNameUnique";
       public            postgres    false    205            d           2606    24685 -   confirmation_history confirmationHistory_pkey 
   CONSTRAINT     m   ALTER TABLE ONLY public.confirmation_history
    ADD CONSTRAINT "confirmationHistory_pkey" PRIMARY KEY (id);
 Y   ALTER TABLE ONLY public.confirmation_history DROP CONSTRAINT "confirmationHistory_pkey";
       public            postgres    false    209            P           2606    24711    users email_unique 
   CONSTRAINT     N   ALTER TABLE ONLY public.users
    ADD CONSTRAINT email_unique UNIQUE (email);
 <   ALTER TABLE ONLY public.users DROP CONSTRAINT email_unique;
       public            postgres    false    201            \           2606    24726    employers employers_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.employers
    ADD CONSTRAINT employers_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.employers DROP CONSTRAINT employers_pkey;
       public            postgres    false    205            X           2606    24733    job_seekers jobSeekers_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.job_seekers
    ADD CONSTRAINT "jobSeekers_pkey" PRIMARY KEY (id);
 G   ALTER TABLE ONLY public.job_seekers DROP CONSTRAINT "jobSeekers_pkey";
       public            postgres    false    204            T           2606    32781    positions position_name_unique 
   CONSTRAINT     b   ALTER TABLE ONLY public.positions
    ADD CONSTRAINT position_name_unique UNIQUE (position_name);
 H   ALTER TABLE ONLY public.positions DROP CONSTRAINT position_name_unique;
       public            postgres    false    203            V           2606    24630    positions positions_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.positions
    ADD CONSTRAINT positions_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.positions DROP CONSTRAINT positions_pkey;
       public            postgres    false    203            ^           2606    24696    system_workers staffCodeUnique 
   CONSTRAINT     a   ALTER TABLE ONLY public.system_workers
    ADD CONSTRAINT "staffCodeUnique" UNIQUE (staff_code);
 J   ALTER TABLE ONLY public.system_workers DROP CONSTRAINT "staffCodeUnique";
       public            postgres    false    206            `           2606    24741 !   system_workers systemWorkers_pkey 
   CONSTRAINT     a   ALTER TABLE ONLY public.system_workers
    ADD CONSTRAINT "systemWorkers_pkey" PRIMARY KEY (id);
 M   ALTER TABLE ONLY public.system_workers DROP CONSTRAINT "systemWorkers_pkey";
       public            postgres    false    206            R           2606    24599    users users_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    201            b           2606    24748 )   verification_codes verificationCodes_pkey 
   CONSTRAINT     i   ALTER TABLE ONLY public.verification_codes
    ADD CONSTRAINT "verificationCodes_pkey" PRIMARY KEY (id);
 U   ALTER TABLE ONLY public.verification_codes DROP CONSTRAINT "verificationCodes_pkey";
       public            postgres    false    207            e           1259    24694 %   fki_confirmationHistoryCompanyForeign    INDEX     x   CREATE INDEX "fki_confirmationHistoryCompanyForeign" ON public.confirmation_history USING btree (is_confirmed_company);
 ;   DROP INDEX public."fki_confirmationHistoryCompanyForeign";
       public            postgres    false    209            f           1259    24702 '   fki_confirmationHistoryStaffCodeForeign    INDEX     {   CREATE INDEX "fki_confirmationHistoryStaffCodeForeign" ON public.confirmation_history USING btree (confirming_staff_code);
 =   DROP INDEX public."fki_confirmationHistoryStaffCodeForeign";
       public            postgres    false    209            k           2606    24689 6   confirmation_history confirmationHistoryCompanyForeign    FK CONSTRAINT     �   ALTER TABLE ONLY public.confirmation_history
    ADD CONSTRAINT "confirmationHistoryCompanyForeign" FOREIGN KEY (is_confirmed_company) REFERENCES public.employers(company_name) NOT VALID;
 b   ALTER TABLE ONLY public.confirmation_history DROP CONSTRAINT "confirmationHistoryCompanyForeign";
       public          postgres    false    205    2906    209            l           2606    24697 8   confirmation_history confirmationHistoryStaffCodeForeign    FK CONSTRAINT     �   ALTER TABLE ONLY public.confirmation_history
    ADD CONSTRAINT "confirmationHistoryStaffCodeForeign" FOREIGN KEY (confirming_staff_code) REFERENCES public.system_workers(staff_code) NOT VALID;
 d   ALTER TABLE ONLY public.confirmation_history DROP CONSTRAINT "confirmationHistoryStaffCodeForeign";
       public          postgres    false    209    2910    206            h           2606    24648    employers employers_foreign    FK CONSTRAINT     �   ALTER TABLE ONLY public.employers
    ADD CONSTRAINT employers_foreign FOREIGN KEY (user_id) REFERENCES public.users(id) NOT VALID;
 E   ALTER TABLE ONLY public.employers DROP CONSTRAINT employers_foreign;
       public          postgres    false    205    2898    201            g           2606    24637    job_seekers jobSeekers_foreign    FK CONSTRAINT     �   ALTER TABLE ONLY public.job_seekers
    ADD CONSTRAINT "jobSeekers_foreign" FOREIGN KEY (user_id) REFERENCES public.users(id) NOT VALID;
 J   ALTER TABLE ONLY public.job_seekers DROP CONSTRAINT "jobSeekers_foreign";
       public          postgres    false    2898    201    204            i           2606    24659 #   system_workers systemWorkersForeign    FK CONSTRAINT     �   ALTER TABLE ONLY public.system_workers
    ADD CONSTRAINT "systemWorkersForeign" FOREIGN KEY (user_id) REFERENCES public.users(id) NOT VALID;
 O   ALTER TABLE ONLY public.system_workers DROP CONSTRAINT "systemWorkersForeign";
       public          postgres    false    2898    206    201            j           2606    24705 +   verification_codes verificationCodesForeign    FK CONSTRAINT     �   ALTER TABLE ONLY public.verification_codes
    ADD CONSTRAINT "verificationCodesForeign" FOREIGN KEY (user_id) REFERENCES public.users(id) NOT VALID;
 W   ALTER TABLE ONLY public.verification_codes DROP CONSTRAINT "verificationCodesForeign";
       public          postgres    false    2898    201    207           