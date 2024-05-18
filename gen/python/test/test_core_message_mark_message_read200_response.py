# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_message_mark_message_read200_response import CoreMessageMarkMessageRead200Response

class TestCoreMessageMarkMessageRead200Response(unittest.TestCase):
    """CoreMessageMarkMessageRead200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreMessageMarkMessageRead200Response:
        """Test CoreMessageMarkMessageRead200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreMessageMarkMessageRead200Response`
        """
        model = CoreMessageMarkMessageRead200Response()
        if include_optional:
            return CoreMessageMarkMessageRead200Response(
                messageid = 56,
                warnings = [
                    openapi_client.models.auth_email_signup_user_200_response_warnings_inner.auth_email_signup_user_200_response_warnings_inner(
                        item = '', 
                        itemid = 56, 
                        message = '', 
                        warningcode = '', )
                    ]
            )
        else:
            return CoreMessageMarkMessageRead200Response(
                messageid = 56,
        )
        """

    def testCoreMessageMarkMessageRead200Response(self):
        """Test CoreMessageMarkMessageRead200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()