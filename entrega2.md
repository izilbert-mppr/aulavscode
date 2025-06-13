1) Diferencie CI, CD e Deploy Contínuo
- CI (Continuous Integration - Integração Contínua)
**Definição:**
CI é uma **disciplina** de desenvolvimento de software onde os desenvolvedores integram seu código em um repositório compartilhado (tipicamente Git) de forma frequente e regular, idealmente várias vezes ao dia. Cada integração desencadeia um **pipeline automatizado de validação inicial**.

- CD (Continuous Delivery - Entrega Contínua)
**Definição:**
CD é uma **extensão** da Integração Contínua. Ele assegura que o software, uma vez validado pela CI, esteja **sempre em um estado "lançável" (deployable)** para produção, ou para qualquer ambiente (staging, QA, UAT), a qualquer momento. O pipeline de CD automatiza todas as etapas necessárias para preparar o artefato para um lançamento, com a **exceção da decisão final de *go-live* para produção**, que permanece como um *gate* manual.

- Deploy Contínuo (Continuous Deployment)
**Definição:**
Deploy Contínuo é o **nível mais avançado de automação** do pipeline de software e uma evolução direta da Entrega Contínua. Ele estende o CD ao **automatizar a implantação em produção** de todas as mudanças que passam com sucesso por todos os estágios do pipeline de CI/CD, **sem a necessidade de qualquer intervenção humana**.

2) Explique o pipeline de entrega
O Pipeline de Entrega (ou *Delivery Pipeline*) é um conceito central no DevOps e na entrega contínua de software. Ele representa a **automatização e orquestração de todo o processo pelo qual o código-fonte de uma aplicação passa** desde o momento em que é escrito por um desenvolvedor até que esteja em produção, disponível para os usuários finais. Pode-se imaginar o pipeline como uma **linha de produção contínua e automatizada para o seu software**, onde cada etapa adiciona uma camada de validação e refinamento, garantindo que o produto final seja entregue com qualidade, velocidade e confiabilidade.

3) Cite ao menos um padrão de release e sua utilidade
Padrão de Release: Blue-Green Deployment (Implantação Azul-Verde)
O Blue-Green Deployment é um dos padrões de release mais eficazes para garantir alta disponibilidade e facilitar rollbacks rápidos em ambientes de produção.