# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.block_iomad_company_admin_get_department_users200_response_users_inner import BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner

class TestBlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner(unittest.TestCase):
    """BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner:
        """Test BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner`
        """
        model = BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner()
        if include_optional:
            return BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner(
                companyid = 56,
                departmentid = 56,
                email = 'null',
                firstname = 'null',
                id = 56,
                lastname = 'null'
            )
        else:
            return BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner(
        )
        """

    def testBlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner(self):
        """Test BlockIomadCompanyAdminGetDepartmentUsers200ResponseUsersInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
