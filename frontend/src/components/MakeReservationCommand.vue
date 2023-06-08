<template>

    <v-card outlined>
        <v-card-title>
            MakeReservation
        </v-card-title>

        <v-card-text>
            <String label="PassengerName" v-model="value.passengerName" :editMode="editMode"/>
            <String label="AssistanceType" v-model="value.assistanceType" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="makeReservation"
            >
                MakeReservation
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'MakeReservationCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.passengerName = '';
            this.value.assistanceType = '';
        },
        watch: {
        },
        methods: {
            makeReservation() {
                this.$emit('makeReservation', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

