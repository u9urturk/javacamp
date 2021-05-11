PGDMP     
    ;                y            Hrms    13.2    13.2 -    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16563    Hrms    DATABASE     c   CREATE DATABASE "Hrms" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE "Hrms";
                postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
                postgres    false            �           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                   postgres    false    3            �            1259    24681    confirmationHistory    TABLE     �   CREATE TABLE public."confirmationHistory" (
    id integer NOT NULL,
    "isConfirmedCompany" character varying(50) NOT NULL,
    "confirmingStaffCode" character varying(5) NOT NULL
);
 )   DROP TABLE public."confirmationHistory";
       public         heap    postgres    false    3            �            1259    24679    confirmationHistory_id_seq    SEQUENCE     �   ALTER TABLE public."confirmationHistory" ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."confirmationHistory_id_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
    CYCLE
);
            public          postgres    false    3    209            �            1259    24642 	   employers    TABLE     3  CREATE TABLE public.employers (
    id integer NOT NULL,
    "companyName" character varying(50) NOT NULL,
    "webAdress" character varying(250) NOT NULL,
    "phoneNumber" character varying(10) NOT NULL,
    "isConfirmed" boolean DEFAULT false NOT NULL,
    "isVerified" boolean DEFAULT false NOT NULL
);
    DROP TABLE public.employers;
       public         heap    postgres    false    3            �            1259    24631 
   jobSeekers    TABLE     '  CREATE TABLE public."jobSeekers" (
    id integer NOT NULL,
    "firstName" character varying(25) NOT NULL,
    "lastName" character varying(25) NOT NULL,
    "nationalIdentity" character varying(11) NOT NULL,
    "birthDate" integer NOT NULL,
    "isVerified" boolean DEFAULT false NOT NULL
);
     DROP TABLE public."jobSeekers";
       public         heap    postgres    false    3            �            1259    24626 	   positions    TABLE     n   CREATE TABLE public.positions (
    id integer NOT NULL,
    "positionName" character varying(20) NOT NULL
);
    DROP TABLE public.positions;
       public         heap    postgres    false    3            �            1259    24624    positions_id_seq    SEQUENCE     �   ALTER TABLE public.positions ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.positions_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
    CYCLE
);
            public          postgres    false    3    203            �            1259    24654    systemWorkers    TABLE     �   CREATE TABLE public."systemWorkers" (
    id integer NOT NULL,
    "staffCode" character varying(20) NOT NULL,
    "firstName" character varying(25) NOT NULL,
    "lastName" character varying(25) NOT NULL
);
 #   DROP TABLE public."systemWorkers";
       public         heap    postgres    false    3            �            1259    24592    users    TABLE     �   CREATE TABLE public.users (
    id integer NOT NULL,
    email character varying(250) NOT NULL,
    password character varying(250) NOT NULL,
    "passwordConfirm" boolean DEFAULT false NOT NULL
);
    DROP TABLE public.users;
       public         heap    postgres    false    3            �            1259    24590    users_id_seq    SEQUENCE     �   ALTER TABLE public.users ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.users_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
    CYCLE
);
            public          postgres    false    3    201            �            1259    24664    verificationCodes    TABLE     �   CREATE TABLE public."verificationCodes" (
    id integer NOT NULL,
    code character varying(5) NOT NULL,
    "creationDate" date NOT NULL
);
 '   DROP TABLE public."verificationCodes";
       public         heap    postgres    false    3            �          0    24681    confirmationHistory 
   TABLE DATA           `   COPY public."confirmationHistory" (id, "isConfirmedCompany", "confirmingStaffCode") FROM stdin;
    public          postgres    false    209   97       �          0    24642 	   employers 
   TABLE DATA           o   COPY public.employers (id, "companyName", "webAdress", "phoneNumber", "isConfirmed", "isVerified") FROM stdin;
    public          postgres    false    205   b7       �          0    24631 
   jobSeekers 
   TABLE DATA           r   COPY public."jobSeekers" (id, "firstName", "lastName", "nationalIdentity", "birthDate", "isVerified") FROM stdin;
    public          postgres    false    204   �7       �          0    24626 	   positions 
   TABLE DATA           7   COPY public.positions (id, "positionName") FROM stdin;
    public          postgres    false    203   �7       �          0    24654    systemWorkers 
   TABLE DATA           S   COPY public."systemWorkers" (id, "staffCode", "firstName", "lastName") FROM stdin;
    public          postgres    false    206   
8       �          0    24592    users 
   TABLE DATA           G   COPY public.users (id, email, password, "passwordConfirm") FROM stdin;
    public          postgres    false    201   68       �          0    24664    verificationCodes 
   TABLE DATA           G   COPY public."verificationCodes" (id, code, "creationDate") FROM stdin;
    public          postgres    false    207   u8       �           0    0    confirmationHistory_id_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public."confirmationHistory_id_seq"', 3, true);
          public          postgres    false    208            �           0    0    positions_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.positions_id_seq', 2, true);
          public          postgres    false    202            �           0    0    users_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.users_id_seq', 7, true);
          public          postgres    false    200            N           2606    24688    employers companyNameUnique 
   CONSTRAINT     a   ALTER TABLE ONLY public.employers
    ADD CONSTRAINT "companyNameUnique" UNIQUE ("companyName");
 G   ALTER TABLE ONLY public.employers DROP CONSTRAINT "companyNameUnique";
       public            postgres    false    205            X           2606    24685 ,   confirmationHistory confirmationHistory_pkey 
   CONSTRAINT     n   ALTER TABLE ONLY public."confirmationHistory"
    ADD CONSTRAINT "confirmationHistory_pkey" PRIMARY KEY (id);
 Z   ALTER TABLE ONLY public."confirmationHistory" DROP CONSTRAINT "confirmationHistory_pkey";
       public            postgres    false    209            D           2606    24711    users email_unique 
   CONSTRAINT     N   ALTER TABLE ONLY public.users
    ADD CONSTRAINT email_unique UNIQUE (email);
 <   ALTER TABLE ONLY public.users DROP CONSTRAINT email_unique;
       public            postgres    false    201            P           2606    24646    employers employers_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.employers
    ADD CONSTRAINT employers_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.employers DROP CONSTRAINT employers_pkey;
       public            postgres    false    205            L           2606    24636    jobSeekers jobSeekers_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public."jobSeekers"
    ADD CONSTRAINT "jobSeekers_pkey" PRIMARY KEY (id);
 H   ALTER TABLE ONLY public."jobSeekers" DROP CONSTRAINT "jobSeekers_pkey";
       public            postgres    false    204            H           2606    24713    positions positionName_unique 
   CONSTRAINT     d   ALTER TABLE ONLY public.positions
    ADD CONSTRAINT "positionName_unique" UNIQUE ("positionName");
 I   ALTER TABLE ONLY public.positions DROP CONSTRAINT "positionName_unique";
       public            postgres    false    203            J           2606    24630    positions positions_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.positions
    ADD CONSTRAINT positions_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.positions DROP CONSTRAINT positions_pkey;
       public            postgres    false    203            R           2606    24696    systemWorkers staffCodeUnique 
   CONSTRAINT     c   ALTER TABLE ONLY public."systemWorkers"
    ADD CONSTRAINT "staffCodeUnique" UNIQUE ("staffCode");
 K   ALTER TABLE ONLY public."systemWorkers" DROP CONSTRAINT "staffCodeUnique";
       public            postgres    false    206            T           2606    24658     systemWorkers systemWorkers_pkey 
   CONSTRAINT     b   ALTER TABLE ONLY public."systemWorkers"
    ADD CONSTRAINT "systemWorkers_pkey" PRIMARY KEY (id);
 N   ALTER TABLE ONLY public."systemWorkers" DROP CONSTRAINT "systemWorkers_pkey";
       public            postgres    false    206            F           2606    24599    users users_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.users DROP CONSTRAINT users_pkey;
       public            postgres    false    201            V           2606    24668 (   verificationCodes verificationCodes_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public."verificationCodes"
    ADD CONSTRAINT "verificationCodes_pkey" PRIMARY KEY (id);
 V   ALTER TABLE ONLY public."verificationCodes" DROP CONSTRAINT "verificationCodes_pkey";
       public            postgres    false    207            Y           1259    24694 %   fki_confirmationHistoryCompanyForeign    INDEX     y   CREATE INDEX "fki_confirmationHistoryCompanyForeign" ON public."confirmationHistory" USING btree ("isConfirmedCompany");
 ;   DROP INDEX public."fki_confirmationHistoryCompanyForeign";
       public            postgres    false    209            Z           1259    24702 '   fki_confirmationHistoryStaffCodeForeign    INDEX     |   CREATE INDEX "fki_confirmationHistoryStaffCodeForeign" ON public."confirmationHistory" USING btree ("confirmingStaffCode");
 =   DROP INDEX public."fki_confirmationHistoryStaffCodeForeign";
       public            postgres    false    209            _           2606    24689 5   confirmationHistory confirmationHistoryCompanyForeign    FK CONSTRAINT     �   ALTER TABLE ONLY public."confirmationHistory"
    ADD CONSTRAINT "confirmationHistoryCompanyForeign" FOREIGN KEY ("isConfirmedCompany") REFERENCES public.employers("companyName") NOT VALID;
 c   ALTER TABLE ONLY public."confirmationHistory" DROP CONSTRAINT "confirmationHistoryCompanyForeign";
       public          postgres    false    2894    205    209            `           2606    24697 7   confirmationHistory confirmationHistoryStaffCodeForeign    FK CONSTRAINT     �   ALTER TABLE ONLY public."confirmationHistory"
    ADD CONSTRAINT "confirmationHistoryStaffCodeForeign" FOREIGN KEY ("confirmingStaffCode") REFERENCES public."systemWorkers"("staffCode") NOT VALID;
 e   ALTER TABLE ONLY public."confirmationHistory" DROP CONSTRAINT "confirmationHistoryStaffCodeForeign";
       public          postgres    false    206    209    2898            \           2606    24648    employers employers_foreign    FK CONSTRAINT        ALTER TABLE ONLY public.employers
    ADD CONSTRAINT employers_foreign FOREIGN KEY (id) REFERENCES public.users(id) NOT VALID;
 E   ALTER TABLE ONLY public.employers DROP CONSTRAINT employers_foreign;
       public          postgres    false    2886    201    205            [           2606    24637    jobSeekers jobSeekers_foreign    FK CONSTRAINT     �   ALTER TABLE ONLY public."jobSeekers"
    ADD CONSTRAINT "jobSeekers_foreign" FOREIGN KEY (id) REFERENCES public.users(id) NOT VALID;
 K   ALTER TABLE ONLY public."jobSeekers" DROP CONSTRAINT "jobSeekers_foreign";
       public          postgres    false    204    201    2886            ]           2606    24659 "   systemWorkers systemWorkersForeign    FK CONSTRAINT     �   ALTER TABLE ONLY public."systemWorkers"
    ADD CONSTRAINT "systemWorkersForeign" FOREIGN KEY (id) REFERENCES public.users(id) NOT VALID;
 P   ALTER TABLE ONLY public."systemWorkers" DROP CONSTRAINT "systemWorkersForeign";
       public          postgres    false    201    206    2886            ^           2606    24705 *   verificationCodes verificationCodesForeign    FK CONSTRAINT     �   ALTER TABLE ONLY public."verificationCodes"
    ADD CONSTRAINT "verificationCodesForeign" FOREIGN KEY (id) REFERENCES public.users(id) NOT VALID;
 X   ALTER TABLE ONLY public."verificationCodes" DROP CONSTRAINT "verificationCodesForeign";
       public          postgres    false    201    2886    207            �      x�3�,I-.�,�,-����� ,UM      �   #   x�3�,I-.�LLI,NKS`V1ggW� �&
      �   &   x�3�=2���3��lNC�4����L����� �z	�      �   /   x�3��O+)O,JUpI-K��/H-�2B:%gd��&�p��qqq ��E      �      x�3�,�,-�,M%�E�\1z\\\ My"      �   /   x�3�LI�K�Mu�M���K���44261�,�2�,M/-������ �D      �      x������ � �     