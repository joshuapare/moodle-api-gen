# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.block_iomad_company_admin_get_departments200_response_departments_inner import BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner

class TestBlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner(unittest.TestCase):
    """BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner:
        """Test BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner`
        """
        model = BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner()
        if include_optional:
            return BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner(
                company = 56,
                id = 56,
                name = 'null',
                parent = 56,
                shortname = 'null'
            )
        else:
            return BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner(
        )
        """

    def testBlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner(self):
        """Test BlockIomadCompanyAdminGetDepartments200ResponseDepartmentsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
