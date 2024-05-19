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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// one or many licenses
    /// </summary>
    [DataContract(Name = "block_iomad_company_admin_create_licenses_request_licenses_inner")]
    public partial class BlockIomadCompanyAdminCreateLicensesRequestLicensesInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BlockIomadCompanyAdminCreateLicensesRequestLicensesInner" /> class.
        /// </summary>
        /// <param name="allocation">Number of license slots (default to null).</param>
        /// <param name="clearonexpire">Clear license assignments on expire - 0 &#x3D; no, 1 &#x3D; yes (default to null).</param>
        /// <param name="companyid">Company id (default to null).</param>
        /// <param name="courses">courses.</param>
        /// <param name="cutoffdate">License cut off date (int &#x3D; timestamp) (default to null).</param>
        /// <param name="expirydate">License expiry date (int &#x3D; timestamp) (default to null).</param>
        /// <param name="instant">Instant access - 0 &#x3D; no, 1 &#x3D; yes (default to null).</param>
        /// <param name="name">License name (default to &quot;null&quot;).</param>
        /// <param name="parentid">Parent license id (default to null).</param>
        /// <param name="program">Program pf courses 0 &#x3D; no, 1 &#x3D; yes (default to null).</param>
        /// <param name="reference">License reference (default to &quot;null&quot;).</param>
        /// <param name="startdate">Date from which the liucense is available (int &#x3D; timestamp)  (default to null).</param>
        /// <param name="type">License type - 0 &#x3D; standard, 1 &#x3D; reusable, 2 &#x3D; standard educator, 3 &#x3D; reusable educator (default to null).</param>
        /// <param name="used">Number how often the lic can be allocated (default to null).</param>
        /// <param name="validlength">Course access length (days) (default to null).</param>
        public BlockIomadCompanyAdminCreateLicensesRequestLicensesInner(int allocation = null, int clearonexpire = null, int companyid = null, List<BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner> courses = default(List<BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner>), int cutoffdate = null, int expirydate = null, int instant = null, string name = @"null", int parentid = null, int program = null, string reference = @"null", int startdate = null, int type = null, int used = null, int validlength = null)
        {
            this.Allocation = allocation;
            this.Clearonexpire = clearonexpire;
            this.Companyid = companyid;
            this.Courses = courses;
            this.Cutoffdate = cutoffdate;
            this.Expirydate = expirydate;
            this.Instant = instant;
            // use default value if no "name" provided
            this.Name = name ?? @"null";
            this.Parentid = parentid;
            this.Program = program;
            // use default value if no "reference" provided
            this.Reference = reference ?? @"null";
            this.Startdate = startdate;
            this.Type = type;
            this.Used = used;
            this.Validlength = validlength;
        }

        /// <summary>
        /// Number of license slots
        /// </summary>
        /// <value>Number of license slots</value>
        [DataMember(Name = "allocation", EmitDefaultValue = false)]
        public int Allocation { get; set; }

        /// <summary>
        /// Clear license assignments on expire - 0 &#x3D; no, 1 &#x3D; yes
        /// </summary>
        /// <value>Clear license assignments on expire - 0 &#x3D; no, 1 &#x3D; yes</value>
        [DataMember(Name = "clearonexpire", EmitDefaultValue = false)]
        public int Clearonexpire { get; set; }

        /// <summary>
        /// Company id
        /// </summary>
        /// <value>Company id</value>
        [DataMember(Name = "companyid", EmitDefaultValue = false)]
        public int Companyid { get; set; }

        /// <summary>
        /// Gets or Sets Courses
        /// </summary>
        [DataMember(Name = "courses", EmitDefaultValue = false)]
        public List<BlockIomadCompanyAdminCreateLicensesRequestLicensesInnerCoursesInner> Courses { get; set; }

        /// <summary>
        /// License cut off date (int &#x3D; timestamp)
        /// </summary>
        /// <value>License cut off date (int &#x3D; timestamp)</value>
        [DataMember(Name = "cutoffdate", EmitDefaultValue = false)]
        public int Cutoffdate { get; set; }

        /// <summary>
        /// License expiry date (int &#x3D; timestamp)
        /// </summary>
        /// <value>License expiry date (int &#x3D; timestamp)</value>
        [DataMember(Name = "expirydate", EmitDefaultValue = false)]
        public int Expirydate { get; set; }

        /// <summary>
        /// Instant access - 0 &#x3D; no, 1 &#x3D; yes
        /// </summary>
        /// <value>Instant access - 0 &#x3D; no, 1 &#x3D; yes</value>
        [DataMember(Name = "instant", EmitDefaultValue = false)]
        public int Instant { get; set; }

        /// <summary>
        /// License name
        /// </summary>
        /// <value>License name</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Parent license id
        /// </summary>
        /// <value>Parent license id</value>
        [DataMember(Name = "parentid", EmitDefaultValue = false)]
        public int Parentid { get; set; }

        /// <summary>
        /// Program pf courses 0 &#x3D; no, 1 &#x3D; yes
        /// </summary>
        /// <value>Program pf courses 0 &#x3D; no, 1 &#x3D; yes</value>
        [DataMember(Name = "program", EmitDefaultValue = false)]
        public int Program { get; set; }

        /// <summary>
        /// License reference
        /// </summary>
        /// <value>License reference</value>
        [DataMember(Name = "reference", EmitDefaultValue = false)]
        public string Reference { get; set; }

        /// <summary>
        /// Date from which the liucense is available (int &#x3D; timestamp) 
        /// </summary>
        /// <value>Date from which the liucense is available (int &#x3D; timestamp) </value>
        [DataMember(Name = "startdate", EmitDefaultValue = false)]
        public int Startdate { get; set; }

        /// <summary>
        /// License type - 0 &#x3D; standard, 1 &#x3D; reusable, 2 &#x3D; standard educator, 3 &#x3D; reusable educator
        /// </summary>
        /// <value>License type - 0 &#x3D; standard, 1 &#x3D; reusable, 2 &#x3D; standard educator, 3 &#x3D; reusable educator</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public int Type { get; set; }

        /// <summary>
        /// Number how often the lic can be allocated
        /// </summary>
        /// <value>Number how often the lic can be allocated</value>
        [DataMember(Name = "used", EmitDefaultValue = false)]
        public int Used { get; set; }

        /// <summary>
        /// Course access length (days)
        /// </summary>
        /// <value>Course access length (days)</value>
        [DataMember(Name = "validlength", EmitDefaultValue = false)]
        public int Validlength { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BlockIomadCompanyAdminCreateLicensesRequestLicensesInner {\n");
            sb.Append("  Allocation: ").Append(Allocation).Append("\n");
            sb.Append("  Clearonexpire: ").Append(Clearonexpire).Append("\n");
            sb.Append("  Companyid: ").Append(Companyid).Append("\n");
            sb.Append("  Courses: ").Append(Courses).Append("\n");
            sb.Append("  Cutoffdate: ").Append(Cutoffdate).Append("\n");
            sb.Append("  Expirydate: ").Append(Expirydate).Append("\n");
            sb.Append("  Instant: ").Append(Instant).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Parentid: ").Append(Parentid).Append("\n");
            sb.Append("  Program: ").Append(Program).Append("\n");
            sb.Append("  Reference: ").Append(Reference).Append("\n");
            sb.Append("  Startdate: ").Append(Startdate).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Used: ").Append(Used).Append("\n");
            sb.Append("  Validlength: ").Append(Validlength).Append("\n");
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