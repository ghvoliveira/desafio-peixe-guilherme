# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table buy_option (
  id                            integer auto_increment not null,
  title                         varchar(255),
  normal_price                  double not null,
  sale_price                    double not null,
  percentage_discount           double not null,
  quantity_cupom                bigint,
  start_date                    datetime(6),
  end_date                      datetime(6),
  deal_id                       integer,
  constraint pk_buy_option primary key (id)
);

create table deal (
  id                            integer auto_increment not null,
  title                         varchar(255),
  text                          varchar(255),
  create_date                   datetime(6),
  publish_date                  datetime(6),
  end_date                      datetime(6),
  url                           varchar(255),
  total_sold                    integer,
  type_deal                     integer,
  constraint pk_deal primary key (id)
);

alter table buy_option add constraint fk_buy_option_deal_id foreign key (deal_id) references deal (id) on delete restrict on update restrict;
create index ix_buy_option_deal_id on buy_option (deal_id);


# --- !Downs

alter table buy_option drop foreign key fk_buy_option_deal_id;
drop index ix_buy_option_deal_id on buy_option;

drop table if exists buy_option;

drop table if exists deal;

