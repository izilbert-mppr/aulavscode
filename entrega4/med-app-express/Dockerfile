#sabemos que aqui tem vulnerabilidades
FROM node:19 
WORKDIR /app
ENV NODE_TLS_REJECT_UNAUTHORIZED=0
COPY package*.json ./
COPY wait-for-it.sh /app/wait-for-it.sh
RUN sed -i 's/\r$//' /app/wait-for-it.sh
RUN npm config set strict-ssl false
RUN npm install --unsafe-perm --force --strict-ssl false
COPY . .
EXPOSE 3000
CMD ["npm", "start"]