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
    /// EnrolSelfGetInstanceInfo200Response
    /// </summary>
    [DataContract(Name = "enrol_self_get_instance_info_200_response")]
    public partial class EnrolSelfGetInstanceInfo200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EnrolSelfGetInstanceInfo200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EnrolSelfGetInstanceInfo200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EnrolSelfGetInstanceInfo200Response" /> class.
        /// </summary>
        /// <param name="courseid">id of course (required).</param>
        /// <param name="enrolpassword">password required for enrolment.</param>
        /// <param name="id">id of course enrolment instance (required).</param>
        /// <param name="name">name of enrolment plugin (required).</param>
        /// <param name="status">status of enrolment plugin (required).</param>
        /// <param name="type">type of enrolment plugin (required).</param>
        public EnrolSelfGetInstanceInfo200Response(int courseid = default(int), string enrolpassword = default(string), int id = default(int), string name = default(string), string status = default(string), string type = default(string))
        {
            this.Courseid = courseid;
            this.Id = id;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for EnrolSelfGetInstanceInfo200Response and cannot be null");
            }
            this.Name = name;
            // to ensure "status" is required (not null)
            if (status == null)
            {
                throw new ArgumentNullException("status is a required property for EnrolSelfGetInstanceInfo200Response and cannot be null");
            }
            this.Status = status;
            // to ensure "type" is required (not null)
            if (type == null)
            {
                throw new ArgumentNullException("type is a required property for EnrolSelfGetInstanceInfo200Response and cannot be null");
            }
            this.Type = type;
            this.Enrolpassword = enrolpassword;
        }

        /// <summary>
        /// id of course
        /// </summary>
        /// <value>id of course</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// password required for enrolment
        /// </summary>
        /// <value>password required for enrolment</value>
        [DataMember(Name = "enrolpassword", EmitDefaultValue = false)]
        public string Enrolpassword { get; set; }

        /// <summary>
        /// id of course enrolment instance
        /// </summary>
        /// <value>id of course enrolment instance</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// name of enrolment plugin
        /// </summary>
        /// <value>name of enrolment plugin</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// status of enrolment plugin
        /// </summary>
        /// <value>status of enrolment plugin</value>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public string Status { get; set; }

        /// <summary>
        /// type of enrolment plugin
        /// </summary>
        /// <value>type of enrolment plugin</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public string Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EnrolSelfGetInstanceInfo200Response {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Enrolpassword: ").Append(Enrolpassword).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
