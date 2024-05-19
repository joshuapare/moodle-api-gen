# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_forum_set_pin_state200_response_urls import ModForumSetPinState200ResponseUrls

class TestModForumSetPinState200ResponseUrls(unittest.TestCase):
    """ModForumSetPinState200ResponseUrls unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModForumSetPinState200ResponseUrls:
        """Test ModForumSetPinState200ResponseUrls
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModForumSetPinState200ResponseUrls`
        """
        model = ModForumSetPinState200ResponseUrls()
        if include_optional:
            return ModForumSetPinState200ResponseUrls(
                markasread = 'null',
                pin = 'null',
                subscribe = 'null',
                view = '',
                viewfirstunread = 'null',
                viewlatest = 'null'
            )
        else:
            return ModForumSetPinState200ResponseUrls(
                markasread = 'null',
                subscribe = 'null',
                view = '',
        )
        """

    def testModForumSetPinState200ResponseUrls(self):
        """Test ModForumSetPinState200ResponseUrls"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
