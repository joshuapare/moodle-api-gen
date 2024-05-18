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
    /// ModScormGetScormUserData200ResponseDataInnerDefaultdataInner
    /// </summary>
    [DataContract(Name = "mod_scorm_get_scorm_user_data_200_response_data_inner_defaultdata_inner")]
    public partial class ModScormGetScormUserData200ResponseDataInnerDefaultdataInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModScormGetScormUserData200ResponseDataInnerDefaultdataInner" /> class.
        /// </summary>
        /// <param name="element">element name.</param>
        /// <param name="value">element value.</param>
        public ModScormGetScormUserData200ResponseDataInnerDefaultdataInner(string element = default(string), string value = default(string))
        {
            this.Element = element;
            this.Value = value;
        }

        /// <summary>
        /// element name
        /// </summary>
        /// <value>element name</value>
        [DataMember(Name = "element", EmitDefaultValue = false)]
        public string Element { get; set; }

        /// <summary>
        /// element value
        /// </summary>
        /// <value>element value</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModScormGetScormUserData200ResponseDataInnerDefaultdataInner {\n");
            sb.Append("  Element: ").Append(Element).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
