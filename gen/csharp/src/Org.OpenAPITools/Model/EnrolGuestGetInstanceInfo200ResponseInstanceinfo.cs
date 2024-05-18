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
    /// EnrolGuestGetInstanceInfo200ResponseInstanceinfo
    /// </summary>
    [DataContract(Name = "enrol_guest_get_instance_info_200_response_instanceinfo")]
    public partial class EnrolGuestGetInstanceInfo200ResponseInstanceinfo : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EnrolGuestGetInstanceInfo200ResponseInstanceinfo" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EnrolGuestGetInstanceInfo200ResponseInstanceinfo() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EnrolGuestGetInstanceInfo200ResponseInstanceinfo" /> class.
        /// </summary>
        /// <param name="courseid">Id of course (required) (default to null).</param>
        /// <param name="id">Id of course enrolment instance (required) (default to null).</param>
        /// <param name="name">Name of enrolment plugin (required) (default to &quot;null&quot;).</param>
        /// <param name="passwordrequired">Is a password required? (required) (default to null).</param>
        /// <param name="status">Is the enrolment enabled? (required) (default to null).</param>
        /// <param name="type">Type of enrolment plugin (required) (default to &quot;null&quot;).</param>
        public EnrolGuestGetInstanceInfo200ResponseInstanceinfo(int courseid = null, int id = null, string name = @"null", bool passwordrequired = null, bool status = null, string type = @"null")
        {
            this.Courseid = courseid;
            this.Id = id;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for EnrolGuestGetInstanceInfo200ResponseInstanceinfo and cannot be null");
            }
            this.Name = name;
            this.Passwordrequired = passwordrequired;
            this.Status = status;
            // to ensure "type" is required (not null)
            if (type == null)
            {
                throw new ArgumentNullException("type is a required property for EnrolGuestGetInstanceInfo200ResponseInstanceinfo and cannot be null");
            }
            this.Type = type;
        }

        /// <summary>
        /// Id of course
        /// </summary>
        /// <value>Id of course</value>
        [DataMember(Name = "courseid", IsRequired = true, EmitDefaultValue = true)]
        public int Courseid { get; set; }

        /// <summary>
        /// Id of course enrolment instance
        /// </summary>
        /// <value>Id of course enrolment instance</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public int Id { get; set; }

        /// <summary>
        /// Name of enrolment plugin
        /// </summary>
        /// <value>Name of enrolment plugin</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Is a password required?
        /// </summary>
        /// <value>Is a password required?</value>
        [DataMember(Name = "passwordrequired", IsRequired = true, EmitDefaultValue = true)]
        public bool Passwordrequired { get; set; }

        /// <summary>
        /// Is the enrolment enabled?
        /// </summary>
        /// <value>Is the enrolment enabled?</value>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public bool Status { get; set; }

        /// <summary>
        /// Type of enrolment plugin
        /// </summary>
        /// <value>Type of enrolment plugin</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public string Type { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EnrolGuestGetInstanceInfo200ResponseInstanceinfo {\n");
            sb.Append("  Courseid: ").Append(Courseid).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Passwordrequired: ").Append(Passwordrequired).Append("\n");
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