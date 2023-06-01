import { CapacitorConfig } from '@capacitor/cli';

const config: CapacitorConfig = {
  appId: 'io.ionic.starter',
  appName: 'lista-tarefas',
  webDir: 'www',
  server: {
    androidScheme: 'https'
  }
};

export default config;
