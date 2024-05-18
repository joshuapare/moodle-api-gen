# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_assign_get_user_flags200_response_warnings_inner import ModAssignGetUserFlags200ResponseWarningsInner

class TestModAssignGetUserFlags200ResponseWarningsInner(unittest.TestCase):
    """ModAssignGetUserFlags200ResponseWarningsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModAssignGetUserFlags200ResponseWarningsInner:
        """Test ModAssignGetUserFlags200ResponseWarningsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModAssignGetUserFlags200ResponseWarningsInner`
        """
        model = ModAssignGetUserFlags200ResponseWarningsInner()
        if include_optional:
            return ModAssignGetUserFlags200ResponseWarningsInner(
                item = '',
                itemid = 56,
                message = '',
                warningcode = 'null'
            )
        else:
            return ModAssignGetUserFlags200ResponseWarningsInner(
        )
        """

    def testModAssignGetUserFlags200ResponseWarningsInner(self):
        """Test ModAssignGetUserFlags200ResponseWarningsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()