# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.message_airnotifier_api import MessageAirnotifierApi


class TestMessageAirnotifierApi(unittest.TestCase):
    """MessageAirnotifierApi unit test stubs"""

    def setUp(self) -> None:
        self.api = MessageAirnotifierApi()

    def tearDown(self) -> None:
        pass

    def test_message_airnotifier_are_notification_preferences_configured(self) -> None:
        """Test case for message_airnotifier_are_notification_preferences_configured

        Check if the users have notification preferences configured yet
        """
        pass

    def test_message_airnotifier_enable_device(self) -> None:
        """Test case for message_airnotifier_enable_device

        Enables or disables a registered user device so it can receive Push notifications
        """
        pass

    def test_message_airnotifier_get_user_devices(self) -> None:
        """Test case for message_airnotifier_get_user_devices

        Return the list of mobile devices that are registered in Moodle for the given user
        """
        pass

    def test_message_airnotifier_is_system_configured(self) -> None:
        """Test case for message_airnotifier_is_system_configured

        Check whether the airnotifier settings have been configured
        """
        pass


if __name__ == '__main__':
    unittest.main()
