# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.enrol_license_get_instance_info200_response import EnrolLicenseGetInstanceInfo200Response

class TestEnrolLicenseGetInstanceInfo200Response(unittest.TestCase):
    """EnrolLicenseGetInstanceInfo200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> EnrolLicenseGetInstanceInfo200Response:
        """Test EnrolLicenseGetInstanceInfo200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `EnrolLicenseGetInstanceInfo200Response`
        """
        model = EnrolLicenseGetInstanceInfo200Response()
        if include_optional:
            return EnrolLicenseGetInstanceInfo200Response(
                courseid = 56,
                enrolpassword = 'null',
                id = 56,
                name = 'null',
                status = 'null',
                type = 'null'
            )
        else:
            return EnrolLicenseGetInstanceInfo200Response(
                courseid = 56,
                id = 56,
                name = 'null',
                status = 'null',
                type = 'null',
        )
        """

    def testEnrolLicenseGetInstanceInfo200Response(self):
        """Test EnrolLicenseGetInstanceInfo200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
