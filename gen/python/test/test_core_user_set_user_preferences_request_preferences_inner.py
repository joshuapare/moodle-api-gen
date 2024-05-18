# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_user_set_user_preferences_request_preferences_inner import CoreUserSetUserPreferencesRequestPreferencesInner

class TestCoreUserSetUserPreferencesRequestPreferencesInner(unittest.TestCase):
    """CoreUserSetUserPreferencesRequestPreferencesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreUserSetUserPreferencesRequestPreferencesInner:
        """Test CoreUserSetUserPreferencesRequestPreferencesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreUserSetUserPreferencesRequestPreferencesInner`
        """
        model = CoreUserSetUserPreferencesRequestPreferencesInner()
        if include_optional:
            return CoreUserSetUserPreferencesRequestPreferencesInner(
                name = '',
                userid = 56,
                value = ''
            )
        else:
            return CoreUserSetUserPreferencesRequestPreferencesInner(
        )
        """

    def testCoreUserSetUserPreferencesRequestPreferencesInner(self):
        """Test CoreUserSetUserPreferencesRequestPreferencesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()