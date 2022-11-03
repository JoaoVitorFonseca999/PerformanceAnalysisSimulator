#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double aleatorio()
{
    double u;
    u = (double)rand() / ((double)RAND_MAX + 1);
    u = 1.0 - u;
    return u;
}

int minimo(int num1, int num2)
{
    return (num1 < num2) ? num1 : num2;
}

int main()
{
    double tempo_simulacao, tempo_decorrido, intervalo_medio_chegada, tempo_medio_servico, chegada, servico;

    unsigned long int fila = 0;

    printf("Informe o tempo de simulacao (segundos): ");
    scanf("%lF", &tempo_simulacao);

    printf("Informe o intervalo entre chegadas(segundos): ");
    scanf("%lF", &intervalo_medio_chegada);

    printf("Informe o tempo medio de servico(segundos): ");
    scanf("%lF", &tempo_medio_servico);

    chegada = (-1.0 / (1.0 / intervalo_medio_chegada)) * log(aleatorio());

    while (tempo_decorrido < tempo_simulacao)
    {
        tempo_decorrido = !fila ? chegada : minimo(chegada, servico);

        if (tempo_decorrido == chegada)
        {
            printf("Chegada: %lF\n", tempo_decorrido);
            if (!fila)
            {
                servico = tempo_decorrido + (-1.0 / (1.0 / tempo_medio_servico)) * log(aleatorio());
            }
            fila++;
            chegada = tempo_decorrido + (-1.0 / (1.0 / intervalo_medio_chegada)) * log(aleatorio());
        }
        else
        {
            printf("Saída : %lF\n", tempo_decorrido);
            fila--;
            if (fila)
            {
                servico = tempo_decorrido + (-1.0 / (1.0 / tempo_medio_servico)) * log(aleatorio());
            }
        }
    }

    return 0;
}