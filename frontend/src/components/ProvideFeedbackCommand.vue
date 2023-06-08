<template>

    <v-card outlined>
        <v-card-title>
            ProvideFeedback
        </v-card-title>

        <v-card-text>
            <String label="FeedbackText" v-model="value.feedbackText" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="provideFeedback"
            >
                ProvideFeedback
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
        name: 'ProvideFeedbackCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.feedbackText = '';
        },
        watch: {
        },
        methods: {
            provideFeedback() {
                this.$emit('provideFeedback', this.value);
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

