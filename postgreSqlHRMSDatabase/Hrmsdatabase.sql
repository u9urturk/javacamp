PGDMP     	                    y            Hrms    13.2    13.2 +    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16563    Hrms    DATABASE     c   CREATE DATABASE "Hrms" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE "Hrms";
                postgres    false            �            1259    24681    confirmationHistory    TABLE     �   CREATE TABLE public."confirmationHistory" (
    id integer NOT NULL,
    "isConfirmedCompany" character varying(50) NOT NULL,
    "confirmingStaffCode" character varying(5) NOT NULL
);
 )   DROP TABLE public."confirmationHistory";
       public         heap    postgres    false            �            1259    24679    confirmationHistory_id_seq    SEQUENCE     �   ALTER TABLE public."confirmationHistory" ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."confirmationHistory_id_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
    CYCLE
);
            public          postgres    false    209            �            1259    24642 	   employers    TABLE     3  CREATE TABLE public.employers (
    id integer NOT NULL,
    "companyName" character varying(50) NOT NULL,
    "webAdress" character varying(250) NOT NULL,
    "phoneNumber" character varying(10) NOT NULL,
    "isConfirmed" boolean DEFAULT false NOT NULL,
    "isVerified" boolean DEFAULT false NOT NULL
);
    DROP TABLE public.employers;
       public         heap    postgres    false            �            1259    24631 
   jobSeekers    TABLE     '  CREATE TABLE public."jobSeekers" (
    id integer NOT NULL,
    "firstName" character varying(25) NOT NULL,
    "lastName" character varying(25) NOT NULL,
    "nationalIdentity" character varying(11) NOT NULL,
    "birthDate" integer NOT NULL,
    "isVerified" boolean DEFAULT false NOT NULL
);
     DROP TABLE public."jobSeekers";
       public         heap    postgres    false            �            1259    24626 	   positions    TABLE     n   CREATE TABLE public.positions (
    id integer NOT NULL,
    "positionName" character varying(20) NOT NULL
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
            public          postgres    false    203            �            1259    24654    systemWorkers    TABLE     �   CREATE TABLE public."systemWorkers" (
    id integer NOT NULL,
    "staffCode" character varying(20) NOT NULL,
    "firstName" character varying(25) NOT NULL,
    "lastName" character varying(25) NOT NULL
);
 #   DROP TABLE public."systemWorkers";
       public         heap    postgres    false            �            1259    24592    users    TABLE     �   CREATE TABLE public.users (
    id integer NOT NULL,
    email character varying(250) NOT NULL,
    password character varying(250) NOT NULL,
    "passwordConfirm" boolean DEFAULT false NOT NULL
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
            public          postgres    false    201            �            1259    24664    verificationCodes    TABLE     �   CREATE TABLE public."verificationCodes" (
    id integer NOT NULL,
    code character varying(5) NOT NULL,
    "creationDate" date NOT NULL
);
 '   DROP TABLE public."verificationCodes";
       public         heap    postgres    false            �          0    24681    confirmationHistory 
   TABLE DATA                 public          postgres    false    209   H3       �          0    24642 	   employers 
   TABLE DATA                 public          postgres    false    205   �3       �          0    24631 
   jobSeekers 
   TABLE DATA                 public          postgres    false    204   z4       �          0    24626 	   positions 
   TABLE DATA                 public          postgres    false    203   5       �          0    24654    systemWorkers 
   TABLE DATA                 public          postgres    false    206   �5       �          0    24592    users 
   TABLE DATA                 public          postgres    false    201   '6       �          0    24664    verificationCodes 
   TABLE DATA                 public          postgres    false    207   �6       �           0    0    confirmationHistory_id_seq    SEQUENCE SET     J   SELECT pg_catalog.setval('public."confirmationHistory_id_seq"', 3, true);
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
       public          postgres    false    201    2886    207            �   �   x���v
Q���W((M��L�SJ��K�,�M,�����,.�/�TR��L�QP�,v�H��8��$�U*E�2�҃K�Ҝ�SR�4��\��<]<���#�C\}�}B]!d������zIjq�:�.�,-R״��� �C-�      �   �   x�5ǻ
�0��=OqpQA�v�$�A(�uO�	�F�R|��^���z>v�	z>7i�rBm�1TF5P,�E�w.�/��JHt >�G�9�頡k��$�����&����=��s労��B	��P�����{�\4�      �   �   x���v
Q���W((M��L�S��O
NM�N-*VR��L�QPJ�,*.�K�MUrr�Ē����ϔԼ�̒J�XRfQI�Kb	XAfqXjQfZfj���B��O�k������z���E�@F��=E� �! ����:
i�9ũ��\\\ �<3!      �   }   x���v
Q���W((M��L�+�/�,���+V��L�QP���sS�4��\��<]<���#�C\}�}B]!d������zp~ZIybQ��KjYjN~Aj���5�'��2B�˱(9#�$5�d �!C�      �   k   x���v
Q���W((M��L�S*�,.I��/�N-*VR��L�QP*.ILKs�OIUr�2��K�s���D([S!��'�5XA�LGA�Բ�HD�C�ҢluMk... R#
      �   �   x���v
Q���W((M��L�+-N-*V��L�QH�M���Q(H,..�/
(����yi�E�J�
�a�AA�.�~�
���!��
a�>��2XA�LGA=%5/57�d�^r~�:P������()*Mմ��;́�����s �S3      �   
   x���         