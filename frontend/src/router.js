
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReservationManager from "./components/listers/ReservationCards"
import ReservationDetail from "./components/listers/ReservationDetail"

import FeedbackManager from "./components/listers/FeedbackCards"
import FeedbackDetail from "./components/listers/FeedbackDetail"
import AssistanceRequestManager from "./components/listers/AssistanceRequestCards"
import AssistanceRequestDetail from "./components/listers/AssistanceRequestDetail"

import PassengerLocationManager from "./components/listers/PassengerLocationCards"
import PassengerLocationDetail from "./components/listers/PassengerLocationDetail"
import DriverNotificationManager from "./components/listers/DriverNotificationCards"
import DriverNotificationDetail from "./components/listers/DriverNotificationDetail"

import AssistanceStatisticsManager from "./components/listers/AssistanceStatisticsCards"
import AssistanceStatisticsDetail from "./components/listers/AssistanceStatisticsDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reservations',
                name: 'ReservationManager',
                component: ReservationManager
            },
            {
                path: '/reservations/:id',
                name: 'ReservationDetail',
                component: ReservationDetail
            },

            {
                path: '/feedbacks',
                name: 'FeedbackManager',
                component: FeedbackManager
            },
            {
                path: '/feedbacks/:id',
                name: 'FeedbackDetail',
                component: FeedbackDetail
            },
            {
                path: '/assistanceRequests',
                name: 'AssistanceRequestManager',
                component: AssistanceRequestManager
            },
            {
                path: '/assistanceRequests/:id',
                name: 'AssistanceRequestDetail',
                component: AssistanceRequestDetail
            },

            {
                path: '/passengerLocations',
                name: 'PassengerLocationManager',
                component: PassengerLocationManager
            },
            {
                path: '/passengerLocations/:id',
                name: 'PassengerLocationDetail',
                component: PassengerLocationDetail
            },
            {
                path: '/driverNotifications',
                name: 'DriverNotificationManager',
                component: DriverNotificationManager
            },
            {
                path: '/driverNotifications/:id',
                name: 'DriverNotificationDetail',
                component: DriverNotificationDetail
            },

            {
                path: '/assistanceStatistics',
                name: 'AssistanceStatisticsManager',
                component: AssistanceStatisticsManager
            },
            {
                path: '/assistanceStatistics/:id',
                name: 'AssistanceStatisticsDetail',
                component: AssistanceStatisticsDetail
            },



    ]
})
