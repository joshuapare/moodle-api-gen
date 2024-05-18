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
    /// CoreAuthIsMinorRequest
    /// </summary>
    [DataContract(Name = "core_auth_is_minor_request")]
    public partial class CoreAuthIsMinorRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreAuthIsMinorRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CoreAuthIsMinorRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CoreAuthIsMinorRequest" /> class.
        /// </summary>
        /// <param name="age">Age (required) (default to null).</param>
        /// <param name="country">Country of residence (required) (default to &quot;null&quot;).</param>
        public CoreAuthIsMinorRequest(int age = null, string country = @"null")
        {
            this.Age = age;
            // to ensure "country" is required (not null)
            if (country == null)
            {
                throw new ArgumentNullException("country is a required property for CoreAuthIsMinorRequest and cannot be null");
            }
            this.Country = country;
        }

        /// <summary>
        /// Age
        /// </summary>
        /// <value>Age</value>
        [DataMember(Name = "age", IsRequired = true, EmitDefaultValue = true)]
        public int Age { get; set; }

        /// <summary>
        /// Country of residence
        /// </summary>
        /// <value>Country of residence</value>
        [DataMember(Name = "country", IsRequired = true, EmitDefaultValue = true)]
        public string Country { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CoreAuthIsMinorRequest {\n");
            sb.Append("  Age: ").Append(Age).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
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