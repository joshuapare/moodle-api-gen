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
    /// CoreCompetencyCreatePlan200ResponseReviewer
    /// </summary>
    [DataContract(Name = "core_competency_create_plan_200_response_reviewer")]
    public partial class CoreCompetencyCreatePlan200ResponseReviewer : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyCreatePlan200ResponseReviewer" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreCompetencyCreatePlan200ResponseReviewer() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreCompetencyCreatePlan200ResponseReviewer" /> class.
        /// </summary>
        /// <param name="department">department (required) (default to &quot;&quot;).</param>
        /// <param name="email">email (required) (default to &quot;&quot;).</param>
        /// <param name="fullname">fullname (required).</param>
        /// <param name="id">id (required).</param>
        /// <param name="identity">identity (required) (default to &quot;null&quot;).</param>
        /// <param name="idnumber">idnumber (required) (default to &quot;&quot;).</param>
        /// <param name="institution">institution (required) (default to &quot;&quot;).</param>
        /// <param name="phone1">phone1 (required) (default to &quot;&quot;).</param>
        /// <param name="phone2">phone2 (required) (default to &quot;&quot;).</param>
        /// <param name="profileimageurl">profileimageurl (required) (default to &quot;null&quot;).</param>
        /// <param name="profileimageurlsmall">profileimageurlsmall (required) (default to &quot;null&quot;).</param>
        /// <param name="profileurl">profileurl (required) (default to &quot;null&quot;).</param>
        public CoreCompetencyCreatePlan200ResponseReviewer(string department = @"", string email = @"", string fullname = default(string), int id = default(int), string identity = @"null", string idnumber = @"", string institution = @"", string phone1 = @"", string phone2 = @"", string profileimageurl = @"null", string profileimageurlsmall = @"null", string profileurl = @"null")
        {
            // to ensure "department" is required (not null)
            if (department == null)
            {
                throw new ArgumentNullException("department is a required property for CoreCompetencyCreatePlan200ResponseReviewer and cannot be null");
            }
            this.Department = department;
            // to ensure "email" is required (not null)
            if (email == null)
            {
                throw new ArgumentNullException("email is a required property for CoreCompetencyCreatePlan200ResponseReviewer and cannot be null");
            }
            this.Email = email;
            // to ensure "fullname" is required (not null)
            if (fullname == null)
            {
                throw new ArgumentNullException("fullname is a required property for CoreCompetencyCreatePlan200ResponseReviewer and cannot be null");
            }
            this.Fullname = fullname;
            this.Id = id;
            // to ensure "identity" is required (not null)
            if (identity == null)
            {
                throw new ArgumentNullException("identity is a required property for CoreCompetencyCreatePlan200ResponseReviewer and cannot be null");
            }
            this.Identity = identity;
            // to ensure "idnumber" is required (not null)
            if (idnumber == null)
            {
                throw new ArgumentNullException("idnumber is a required property for CoreCompetencyCreatePlan200ResponseReviewer and cannot be null");
            }
            this.Idnumber = idnumber;
            // to ensure "institution" is required (not null)
            if (institution == null)
            {
                throw new ArgumentNullException("institution is a required property for CoreCompetencyCreatePlan200ResponseReviewer and cannot be null");
            }
            this.Institution = institution;
            // to ensure "phone1" is required (not null)
            if (phone1 == null)
            {
                throw new ArgumentNullException("phone1 is a required property for CoreCompetencyCreatePlan200ResponseReviewer and cannot be null");
            }
            this.Phone1 = phone1;
            // to ensure "phone2" is required (not null)
            if (phone2 == null)
            {
                throw new ArgumentNullException("phone2 is a required property for CoreCompetencyCreatePlan200ResponseReviewer and cannot be null");
            }
            this.Phone2 = phone2;
            // to ensure "profileimageurl" is required (not null)
            if (profileimageurl == null)
            {
                throw new ArgumentNullException("profileimageurl is a required property for CoreCompetencyCreatePlan200ResponseReviewer and cannot be null");
            }
            this.Profileimageurl = profileimageurl;
            // to ensure "profileimageurlsmall" is required (not null)
            if (profileimageurlsmall == null)
            {
                throw new ArgumentNullException("profileimageurlsmall is a required property for CoreCompetencyCreatePlan200ResponseReviewer and cannot be null");
            }
            this.Profileimageurlsmall = profileimageurlsmall;
            // to ensure "profileurl" is required (not null)
            if (profileurl == null)
            {
                throw new ArgumentNullException("profileurl is a required property for CoreCompetencyCreatePlan200ResponseReviewer and cannot be null");
            }
            this.Profileurl = profileurl;
        }

        /// <summary>
        /// department
        /// </summary>
        /// <value>department</value>
        [DataMember(Name = "department", IsRequired = true, EmitDefaultValue = true)]
        public string Department { get; set; }

        /// <summary>
        /// email
        /// </summary>
        /// <value>email</value>
        [DataMember(Name = "email", IsRequired = true, EmitDefaultValue = true)]
        public string Email { get; set; }

        /// <summary>
        /// fullname
        /// </summary>
        /// <value>fullname</value>
        [DataMember(Name = "fullname", IsRequired = true, EmitDefaultValue = true)]
        public string Fullname { get; set; }

        /// <summary>
        /// id
        /// </summary>
        /// <value>id</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// identity
        /// </summary>
        /// <value>identity</value>
        [DataMember(Name = "identity", IsRequired = true, EmitDefaultValue = true)]
        public string Identity { get; set; }

        /// <summary>
        /// idnumber
        /// </summary>
        /// <value>idnumber</value>
        [DataMember(Name = "idnumber", IsRequired = true, EmitDefaultValue = true)]
        public string Idnumber { get; set; }

        /// <summary>
        /// institution
        /// </summary>
        /// <value>institution</value>
        [DataMember(Name = "institution", IsRequired = true, EmitDefaultValue = true)]
        public string Institution { get; set; }

        /// <summary>
        /// phone1
        /// </summary>
        /// <value>phone1</value>
        [DataMember(Name = "phone1", IsRequired = true, EmitDefaultValue = true)]
        public string Phone1 { get; set; }

        /// <summary>
        /// phone2
        /// </summary>
        /// <value>phone2</value>
        [DataMember(Name = "phone2", IsRequired = true, EmitDefaultValue = true)]
        public string Phone2 { get; set; }

        /// <summary>
        /// profileimageurl
        /// </summary>
        /// <value>profileimageurl</value>
        [DataMember(Name = "profileimageurl", IsRequired = true, EmitDefaultValue = true)]
        public string Profileimageurl { get; set; }

        /// <summary>
        /// profileimageurlsmall
        /// </summary>
        /// <value>profileimageurlsmall</value>
        [DataMember(Name = "profileimageurlsmall", IsRequired = true, EmitDefaultValue = true)]
        public string Profileimageurlsmall { get; set; }

        /// <summary>
        /// profileurl
        /// </summary>
        /// <value>profileurl</value>
        [DataMember(Name = "profileurl", IsRequired = true, EmitDefaultValue = true)]
        public string Profileurl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreCompetencyCreatePlan200ResponseReviewer {\n");
            sb.Append("  Department: ").Append(Department).Append("\n");
            sb.Append("  Email: ").Append(Email).Append("\n");
            sb.Append("  Fullname: ").Append(Fullname).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Identity: ").Append(Identity).Append("\n");
            sb.Append("  Idnumber: ").Append(Idnumber).Append("\n");
            sb.Append("  Institution: ").Append(Institution).Append("\n");
            sb.Append("  Phone1: ").Append(Phone1).Append("\n");
            sb.Append("  Phone2: ").Append(Phone2).Append("\n");
            sb.Append("  Profileimageurl: ").Append(Profileimageurl).Append("\n");
            sb.Append("  Profileimageurlsmall: ").Append(Profileimageurlsmall).Append("\n");
            sb.Append("  Profileurl: ").Append(Profileurl).Append("\n");
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
