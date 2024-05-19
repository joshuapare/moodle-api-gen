# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.enrol_self_get_instance_info200_response import EnrolSelfGetInstanceInfo200Response

class TestEnrolSelfGetInstanceInfo200Response(unittest.TestCase):
    """EnrolSelfGetInstanceInfo200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EnrolSelfGetInstanceInfo200Response:
        """Test EnrolSelfGetInstanceInfo200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EnrolSelfGetInstanceInfo200Response`
        """
        model = EnrolSelfGetInstanceInfo200Response()
        if include_optional:
            return EnrolSelfGetInstanceInfo200Response(
                courseid = 56,
                enrolpassword = '',
                id = 56,
                name = '',
                status = '',
                type = ''
            )
        else:
            return EnrolSelfGetInstanceInfo200Response(
                courseid = 56,
                id = 56,
                name = '',
                status = '',
                type = '',
        )
        """

    def testEnrolSelfGetInstanceInfo200Response(self):
        """Test EnrolSelfGetInstanceInfo200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
