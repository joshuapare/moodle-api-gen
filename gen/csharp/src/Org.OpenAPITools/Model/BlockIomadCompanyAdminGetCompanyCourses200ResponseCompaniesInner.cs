/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner
    /// </summary>
    [DataContract(Name = "block_iomad_company_admin_get_company_courses_200_response_companies_inner")]
    public partial class BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner" /> class.
        /// </summary>
        /// <param name="address">Company address (default to &quot;null&quot;).</param>
        /// <param name="city">Company city (default to &quot;null&quot;).</param>
        /// <param name="code">Company code (default to &quot;null&quot;).</param>
        /// <param name="country">Company country (default to &quot;null&quot;).</param>
        /// <param name="courses">courses.</param>
        /// <param name="custom1">Company custom1 (default to &quot;null&quot;).</param>
        /// <param name="custom2">Company custom2 (default to &quot;null&quot;).</param>
        /// <param name="custom3">Company custom3 (default to &quot;null&quot;).</param>
        /// <param name="id">Company ID.</param>
        /// <param name="name">Company name (default to &quot;null&quot;).</param>
        /// <param name="postcode">Company postcode (default to &quot;null&quot;).</param>
        /// <param name="region">Company region (default to &quot;null&quot;).</param>
        /// <param name="shortname">Company shortname (default to &quot;null&quot;).</param>
        public BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner(string address = @"null", string city = @"null", string code = @"null", string country = @"null", List<BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner> courses = default(List<BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner>), string custom1 = @"null", string custom2 = @"null", string custom3 = @"null", int id = default(int), string name = @"null", string postcode = @"null", string region = @"null", string shortname = @"null")
        {
            // use default value if no "address" provided
            this.Address = address ?? @"null";
            // use default value if no "city" provided
            this.City = city ?? @"null";
            // use default value if no "code" provided
            this.Code = code ?? @"null";
            // use default value if no "country" provided
            this.Country = country ?? @"null";
            this.Courses = courses;
            // use default value if no "custom1" provided
            this.Custom1 = custom1 ?? @"null";
            // use default value if no "custom2" provided
            this.Custom2 = custom2 ?? @"null";
            // use default value if no "custom3" provided
            this.Custom3 = custom3 ?? @"null";
            this.Id = id;
            // use default value if no "name" provided
            this.Name = name ?? @"null";
            // use default value if no "postcode" provided
            this.Postcode = postcode ?? @"null";
            // use default value if no "region" provided
            this.Region = region ?? @"null";
            // use default value if no "shortname" provided
            this.Shortname = shortname ?? @"null";
        }

        /// <summary>
        /// Company address
        /// </summary>
        /// <value>Company address</value>
        [DataMember(Name = "address", EmitDefaultValue = false)]
        public string Address { get; set; }

        /// <summary>
        /// Company city
        /// </summary>
        /// <value>Company city</value>
        [DataMember(Name = "city", EmitDefaultValue = false)]
        public string City { get; set; }

        /// <summary>
        /// Company code
        /// </summary>
        /// <value>Company code</value>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// Company country
        /// </summary>
        /// <value>Company country</value>
        [DataMember(Name = "country", EmitDefaultValue = false)]
        public string Country { get; set; }

        /// <summary>
        /// Gets or Sets Courses
        /// </summary>
        [DataMember(Name = "courses", EmitDefaultValue = false)]
        public List<BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInnerCoursesInner> Courses { get; set; }

        /// <summary>
        /// Company custom1
        /// </summary>
        /// <value>Company custom1</value>
        [DataMember(Name = "custom1", EmitDefaultValue = false)]
        public string Custom1 { get; set; }

        /// <summary>
        /// Company custom2
        /// </summary>
        /// <value>Company custom2</value>
        [DataMember(Name = "custom2", EmitDefaultValue = false)]
        public string Custom2 { get; set; }

        /// <summary>
        /// Company custom3
        /// </summary>
        /// <value>Company custom3</value>
        [DataMember(Name = "custom3", EmitDefaultValue = false)]
        public string Custom3 { get; set; }

        /// <summary>
        /// Company ID
        /// </summary>
        /// <value>Company ID</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public int Id { get; set; }

        /// <summary>
        /// Company name
        /// </summary>
        /// <value>Company name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Company postcode
        /// </summary>
        /// <value>Company postcode</value>
        [DataMember(Name = "postcode", EmitDefaultValue = false)]
        public string Postcode { get; set; }

        /// <summary>
        /// Company region
        /// </summary>
        /// <value>Company region</value>
        [DataMember(Name = "region", EmitDefaultValue = false)]
        public string Region { get; set; }

        /// <summary>
        /// Company shortname
        /// </summary>
        /// <value>Company shortname</value>
        [DataMember(Name = "shortname", EmitDefaultValue = false)]
        public string Shortname { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BlockIomadCompanyAdminGetCompanyCourses200ResponseCompaniesInner {\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  City: ").Append(City).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  Courses: ").Append(Courses).Append("\n");
            sb.Append("  Custom1: ").Append(Custom1).Append("\n");
            sb.Append("  Custom2: ").Append(Custom2).Append("\n");
            sb.Append("  Custom3: ").Append(Custom3).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Postcode: ").Append(Postcode).Append("\n");
            sb.Append("  Region: ").Append(Region).Append("\n");
            sb.Append("  Shortname: ").Append(Shortname).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
