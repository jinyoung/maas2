<template>

    <v-card outlined>
        <v-card-title>
            UpdatePassengerLocation
        </v-card-title>

        <v-card-text>
            <String label="PassengerName" v-model="value.passengerName" :editMode="editMode"/>
            <String label="CurrentLocation" v-model="value.currentLocation" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="updatePassengerLocation"
            >
                UpdatePassengerLocation
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
        name: 'UpdatePassengerLocationCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.passengerName = '';
            this.value.currentLocation = '';
        },
        watch: {
        },
        methods: {
            updatePassengerLocation() {
                this.$emit('updatePassengerLocation', this.value);
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

