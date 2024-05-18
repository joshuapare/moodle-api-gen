# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_forum_set_pin_state200_response_group_urls import ModForumSetPinState200ResponseGroupUrls

class TestModForumSetPinState200ResponseGroupUrls(unittest.TestCase):
    """ModForumSetPinState200ResponseGroupUrls unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModForumSetPinState200ResponseGroupUrls:
        """Test ModForumSetPinState200ResponseGroupUrls
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModForumSetPinState200ResponseGroupUrls`
        """
        model = ModForumSetPinState200ResponseGroupUrls()
        if include_optional:
            return ModForumSetPinState200ResponseGroupUrls(
                picture = 'null',
                userlist = 'null'
            )
        else:
            return ModForumSetPinState200ResponseGroupUrls(
        )
        """

    def testModForumSetPinState200ResponseGroupUrls(self):
        """Test ModForumSetPinState200ResponseGroupUrls"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
