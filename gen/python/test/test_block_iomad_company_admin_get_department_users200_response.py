# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.block_iomad_company_admin_get_department_users200_response import BlockIomadCompanyAdminGetDepartmentUsers200Response

class TestBlockIomadCompanyAdminGetDepartmentUsers200Response(unittest.TestCase):
    """BlockIomadCompanyAdminGetDepartmentUsers200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BlockIomadCompanyAdminGetDepartmentUsers200Response:
        """Test BlockIomadCompanyAdminGetDepartmentUsers200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BlockIomadCompanyAdminGetDepartmentUsers200Response`
        """
        model = BlockIomadCompanyAdminGetDepartmentUsers200Response()
        if include_optional:
            return BlockIomadCompanyAdminGetDepartmentUsers200Response(
                users = [
                    openapi_client.models.block_iomad_company_admin_get_department_users_200_response_users_inner.block_iomad_company_admin_get_department_users_200_response_users_inner(
                        companyid = 56, 
                        departmentid = 56, 
                        email = 'null', 
                        firstname = 'null', 
                        id = 56, 
                        lastname = 'null', )
                    ],
                warnings = [
                    openapi_client.models.block_iomad_company_admin_get_companies_200_response_warnings_inner.block_iomad_company_admin_get_companies_200_response_warnings_inner(
                        item = '', 
                        itemid = 56, 
                        message = '', 
                        warningcode = '', )
                    ]
            )
        else:
            return BlockIomadCompanyAdminGetDepartmentUsers200Response(
                users = [
                    openapi_client.models.block_iomad_company_admin_get_department_users_200_response_users_inner.block_iomad_company_admin_get_department_users_200_response_users_inner(
                        companyid = 56, 
                        departmentid = 56, 
                        email = 'null', 
                        firstname = 'null', 
                        id = 56, 
                        lastname = 'null', )
                    ],
        )
        """

    def testBlockIomadCompanyAdminGetDepartmentUsers200Response(self):
        """Test BlockIomadCompanyAdminGetDepartmentUsers200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
