<template>

    <v-card outlined>
        <v-card-title>
            CheckAssistanceRequestStatus
        </v-card-title>

        <v-card-text>
            <String label="RequestId" v-model="value.requestId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="checkAssistanceRequestStatus"
            >
                CheckAssistanceRequestStatus
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
        name: 'CheckAssistanceRequestStatusCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.requestId = '';
        },
        watch: {
        },
        methods: {
            checkAssistanceRequestStatus() {
                this.$emit('checkAssistanceRequestStatus', this.value);
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

