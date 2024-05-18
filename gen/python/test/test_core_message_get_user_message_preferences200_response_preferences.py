# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_message_get_user_message_preferences200_response_preferences import CoreMessageGetUserMessagePreferences200ResponsePreferences

class TestCoreMessageGetUserMessagePreferences200ResponsePreferences(unittest.TestCase):
    """CoreMessageGetUserMessagePreferences200ResponsePreferences unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreMessageGetUserMessagePreferences200ResponsePreferences:
        """Test CoreMessageGetUserMessagePreferences200ResponsePreferences
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreMessageGetUserMessagePreferences200ResponsePreferences`
        """
        model = CoreMessageGetUserMessagePreferences200ResponsePreferences()
        if include_optional:
            return CoreMessageGetUserMessagePreferences200ResponsePreferences(
                components = [
                    openapi_client.models.core_message_get_user_message_preferences_200_response_preferences_components_inner.core_message_get_user_message_preferences_200_response_preferences_components_inner(
                        displayname = 'null', 
                        notifications = [
                            openapi_client.models.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner(
                                displayname = '', 
                                preferencekey = 'null', 
                                processors = [
                                    openapi_client.models.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner_processors_inner.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner_processors_inner(
                                        displayname = '', 
                                        enabled = True, 
                                        locked = True, 
                                        lockedmessage = 'null', 
                                        loggedin = openapi_client.models.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner_processors_inner_loggedin.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner_processors_inner_loggedin(
                                            checked = True, 
                                            displayname = '', 
                                            name = 'null', ), 
                                        loggedoff = openapi_client.models.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner_processors_inner_loggedoff.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner_processors_inner_loggedoff(
                                            checked = True, 
                                            displayname = '', 
                                            name = '', ), 
                                        name = 'null', 
                                        userconfigured = 56, )
                                    ], )
                            ], )
                    ],
                disableall = 56,
                processors = [
                    openapi_client.models.core_message_get_user_message_preferences_200_response_preferences_processors_inner.core_message_get_user_message_preferences_200_response_preferences_processors_inner(
                        contextid = 56, 
                        displayname = '', 
                        hassettings = True, 
                        name = '', 
                        userconfigured = 56, )
                    ],
                userid = 56
            )
        else:
            return CoreMessageGetUserMessagePreferences200ResponsePreferences(
                components = [
                    openapi_client.models.core_message_get_user_message_preferences_200_response_preferences_components_inner.core_message_get_user_message_preferences_200_response_preferences_components_inner(
                        displayname = 'null', 
                        notifications = [
                            openapi_client.models.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner(
                                displayname = '', 
                                preferencekey = 'null', 
                                processors = [
                                    openapi_client.models.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner_processors_inner.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner_processors_inner(
                                        displayname = '', 
                                        enabled = True, 
                                        locked = True, 
                                        lockedmessage = 'null', 
                                        loggedin = openapi_client.models.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner_processors_inner_loggedin.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner_processors_inner_loggedin(
                                            checked = True, 
                                            displayname = '', 
                                            name = 'null', ), 
                                        loggedoff = openapi_client.models.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner_processors_inner_loggedoff.core_message_get_user_message_preferences_200_response_preferences_components_inner_notifications_inner_processors_inner_loggedoff(
                                            checked = True, 
                                            displayname = '', 
                                            name = '', ), 
                                        name = 'null', 
                                        userconfigured = 56, )
                                    ], )
                            ], )
                    ],
                disableall = 56,
                processors = [
                    openapi_client.models.core_message_get_user_message_preferences_200_response_preferences_processors_inner.core_message_get_user_message_preferences_200_response_preferences_processors_inner(
                        contextid = 56, 
                        displayname = '', 
                        hassettings = True, 
                        name = '', 
                        userconfigured = 56, )
                    ],
                userid = 56,
        )
        """

    def testCoreMessageGetUserMessagePreferences200ResponsePreferences(self):
        """Test CoreMessageGetUserMessagePreferences200ResponsePreferences"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()