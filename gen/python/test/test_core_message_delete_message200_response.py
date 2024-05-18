# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_message_delete_message200_response import CoreMessageDeleteMessage200Response

class TestCoreMessageDeleteMessage200Response(unittest.TestCase):
    """CoreMessageDeleteMessage200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreMessageDeleteMessage200Response:
        """Test CoreMessageDeleteMessage200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreMessageDeleteMessage200Response`
        """
        model = CoreMessageDeleteMessage200Response()
        if include_optional:
            return CoreMessageDeleteMessage200Response(
                status = True,
                warnings = [
                    openapi_client.models.auth_email_signup_user_200_response_warnings_inner.auth_email_signup_user_200_response_warnings_inner(
                        item = '', 
                        itemid = 56, 
                        message = '', 
                        warningcode = '', )
                    ]
            )
        else:
            return CoreMessageDeleteMessage200Response(
                status = True,
        )
        """

    def testCoreMessageDeleteMessage200Response(self):
        """Test CoreMessageDeleteMessage200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
