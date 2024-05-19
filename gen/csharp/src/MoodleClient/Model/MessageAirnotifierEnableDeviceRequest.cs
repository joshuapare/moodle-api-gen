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
    /// MessageAirnotifierEnableDeviceRequest
    /// </summary>
    [DataContract(Name = "message_airnotifier_enable_device_request")]
    public partial class MessageAirnotifierEnableDeviceRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="MessageAirnotifierEnableDeviceRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected MessageAirnotifierEnableDeviceRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="MessageAirnotifierEnableDeviceRequest" /> class.
        /// </summary>
        /// <param name="deviceid">The device id (required) (default to null).</param>
        /// <param name="enable">True for enable the device, false otherwise (required) (default to null).</param>
        public MessageAirnotifierEnableDeviceRequest(int deviceid = null, bool enable = null)
        {
            this.Deviceid = deviceid;
            this.Enable = enable;
        }

        /// <summary>
        /// The device id
        /// </summary>
        /// <value>The device id</value>
        [DataMember(Name = "deviceid", IsRequired = true, EmitDefaultValue = true)]
        public int Deviceid { get; set; }

        /// <summary>
        /// True for enable the device, false otherwise
        /// </summary>
        /// <value>True for enable the device, false otherwise</value>
        [DataMember(Name = "enable", IsRequired = true, EmitDefaultValue = true)]
        public bool Enable { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class MessageAirnotifierEnableDeviceRequest {\n");
            sb.Append("  Deviceid: ").Append(Deviceid).Append("\n");
            sb.Append("  Enable: ").Append(Enable).Append("\n");
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