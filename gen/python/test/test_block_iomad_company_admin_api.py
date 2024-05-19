# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.block_iomad_company_admin_api import BlockIomadCompanyAdminApi


class TestBlockIomadCompanyAdminApi(unittest.TestCase):
    """BlockIomadCompanyAdminApi unit test stubs"""

    def setUp(self) -> None:
        self.api = BlockIomadCompanyAdminApi()

    def tearDown(self) -> None:
        pass

    def test_block_iomad_company_admin_allocate_licenses(self) -> None:
        """Test case for block_iomad_company_admin_allocate_licenses

        Allocate course licenses to a user
        """
        pass

    def test_block_iomad_company_admin_assign_courses(self) -> None:
        """Test case for block_iomad_company_admin_assign_courses

        Assign a course to a company
        """
        pass

    def test_block_iomad_company_admin_assign_users(self) -> None:
        """Test case for block_iomad_company_admin_assign_users

        Assign users to a company
        """
        pass

    def test_block_iomad_company_admin_capability_delete_template(self) -> None:
        """Test case for block_iomad_company_admin_capability_delete_template

        Delete Iomad capabilities template
        """
        pass

    def test_block_iomad_company_admin_check_token(self) -> None:
        """Test case for block_iomad_company_admin_check_token

        Check SSO token
        """
        pass

    def test_block_iomad_company_admin_create_companies(self) -> None:
        """Test case for block_iomad_company_admin_create_companies

        Create new Iomad companies
        """
        pass

    def test_block_iomad_company_admin_create_licenses(self) -> None:
        """Test case for block_iomad_company_admin_create_licenses

        Create company licenses
        """
        pass

    def test_block_iomad_company_admin_delete_licenses(self) -> None:
        """Test case for block_iomad_company_admin_delete_licenses

        Delete company licenses
        """
        pass

    def test_block_iomad_company_admin_edit_companies(self) -> None:
        """Test case for block_iomad_company_admin_edit_companies

        Edit Iomad companies
        """
        pass

    def test_block_iomad_company_admin_edit_licenses(self) -> None:
        """Test case for block_iomad_company_admin_edit_licenses

        Edit company license settings
        """
        pass

    def test_block_iomad_company_admin_enrol_users(self) -> None:
        """Test case for block_iomad_company_admin_enrol_users

        Assign users onto courses
        """
        pass

    def test_block_iomad_company_admin_get_companies(self) -> None:
        """Test case for block_iomad_company_admin_get_companies

        Get all Iomad companies
        """
        pass

    def test_block_iomad_company_admin_get_company_courses(self) -> None:
        """Test case for block_iomad_company_admin_get_company_courses

        Get Iomad company course allocations
        """
        pass

    def test_block_iomad_company_admin_get_course_info(self) -> None:
        """Test case for block_iomad_company_admin_get_course_info

        Get Iomad course settings
        """
        pass

    def test_block_iomad_company_admin_get_department_users(self) -> None:
        """Test case for block_iomad_company_admin_get_department_users

        Get users within a department
        """
        pass

    def test_block_iomad_company_admin_get_departments(self) -> None:
        """Test case for block_iomad_company_admin_get_departments

        Get all company departments
        """
        pass

    def test_block_iomad_company_admin_get_license_from_id(self) -> None:
        """Test case for block_iomad_company_admin_get_license_from_id

        Get licence data give the ID
        """
        pass

    def test_block_iomad_company_admin_get_license_info(self) -> None:
        """Test case for block_iomad_company_admin_get_license_info

        Get company license information
        """
        pass

    def test_block_iomad_company_admin_move_users(self) -> None:
        """Test case for block_iomad_company_admin_move_users

        Move users between departments
        """
        pass

    def test_block_iomad_company_admin_restrict_capability(self) -> None:
        """Test case for block_iomad_company_admin_restrict_capability

        set/reset Iomad capability
        """
        pass

    def test_block_iomad_company_admin_sync_users(self) -> None:
        """Test case for block_iomad_company_admin_sync_users

        Call update users to sync to external system
        """
        pass

    def test_block_iomad_company_admin_unallocate_licenses(self) -> None:
        """Test case for block_iomad_company_admin_unallocate_licenses

        Remove course licenses from users
        """
        pass

    def test_block_iomad_company_admin_unassign_courses(self) -> None:
        """Test case for block_iomad_company_admin_unassign_courses

        Unassign a course from a company
        """
        pass

    def test_block_iomad_company_admin_unassign_users(self) -> None:
        """Test case for block_iomad_company_admin_unassign_users

        Unassign users from a company
        """
        pass

    def test_block_iomad_company_admin_update_courses(self) -> None:
        """Test case for block_iomad_company_admin_update_courses

        Update Iomad course settings
        """
        pass


if __name__ == '__main__':
    unittest.main()
